package com.ns.cspgtw.service.api.billing;

import com.ns.cspgtw.helpers.JaxbHelpers;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.ProxyInvokeResult;
import com.ns.cspgtw.proxylayer.ProxyInvokeXmlResult;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingResponse;
import com.ns.cspgtw.service.builder.*;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import org.hibernate.metamodel.source.internal.JaxbHelper;

public class BillingResponseBuilderTim extends AbstractBuilder<BillingResponse, BillingRequest> {
    private Cp cp=null;
    private Service service=null;
    private Billingid billingid=null;
    private ServiceBillingid serviceBillingid=null;
    private Operator operator=null;

    public Cp getCp() {
        if(cp==null){
            cp = getResources().getCpCrud().find(getRequest().getCpId());
        }
        return cp;
    }
    public Service getService() {
        if(service==null) {
            service = getResources().getServiceCrud().find(getRequest().getServiceId());
        }
        return service;
    }
    public Billingid getBillingid() {
        if(billingid==null) {
            billingid = getResources().getBillingidCrud().find(getRequest().getBillingId());
        }
        return billingid;
    }
    public ServiceBillingid getServiceBillingid() {
        if(serviceBillingid==null) {
            serviceBillingid = getResources().getServiceBillingidCrud().findByServiceAndBilling(getRequest().getServiceId(),getRequest().getBillingId());
        }
        return serviceBillingid;
    }
    public Operator getOperator() {
        if(operator==null) {
            operator = getResources().getOperatorCrud().find(getRequest().getOperatorId());

        }

        return operator;
    }

    public BillingResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public BillingResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1003;
        BillingResponse billingResponse = new BillingResponse();

        try {
            MPayTotalBillingResponse mPayTotalBillingResponse = callOperatorApi();

            if(mPayTotalBillingResponse.getResultCode().equals("0")) billingResponse.setStatusCode(0);
            else billingResponse.setStatusCode(1);

            // different in every response
            billingResponse.setChargedAmount("0");
            billingResponse.setTransactionId(  getRequest().getTransactionId());

        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
            billingResponse.setStatusCode(1);
        }

        // common

        billingResponse.setResultCode(resEnum.getCode());
        billingResponse.setResDescription(resEnum.getDescription());



        return billingResponse;
    }

    protected static ResultCodesEnum getByApiCall(int resultCode) {
        switch (resultCode) {
            case 0:
                return ResultCodesEnum.RC1000;


            default:
                return ResultCodesEnum.RC2040;

        }
    }

    private MPayTotalBillingResponse callOperatorApi() throws  Exception {
        MPayTotalBillingRequest mPayTotalBillingRequest = new MPayTotalBillingRequest();
            mPayTotalBillingRequest.setMerchantId( getCp().getTimMpayMerchantId());


        MPayTotalBillingDTO dto = new MPayTotalBillingDTO(mPayTotalBillingRequest);


        String xml = getResources().invokeXmlProxy( dto ).getResult();
        MPayTotalBillingResponse mPayTotalBillingResponse =
                (MPayTotalBillingResponse) JaxbHelpers.unmarshall(xml, MPayTotalBillingResponse.class.getName());

        return mPayTotalBillingResponse;
    }
}

