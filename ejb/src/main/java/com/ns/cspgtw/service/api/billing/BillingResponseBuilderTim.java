package com.ns.cspgtw.service.api.billing;

import com.ns.cspgtw.helpers.JaxbCpUtilities;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingResponse;
import com.ns.cspgtw.service.builder.*;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class BillingResponseBuilderTim extends AbstractBuilder<BillingResponse, BillingRequest> {

    //  database start
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

    //  database end

    public BillingResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public BillingResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1003; // immutable
        BillingResponse billingResponse = new BillingResponse(); // excel response

        try {
            MPayTotalBillingResponse mPayTotalBillingResponse = callOperatorApi(); //mpay response pdf

            // response
            if(mPayTotalBillingResponse.getResultCode().equals("0"))
                billingResponse.setStatusCode(0);
            else
                billingResponse.setStatusCode(1);

            resEnum = getByApiCall(  new Integer(mPayTotalBillingResponse.getResultCode()));

            // completare qui la response se ci sono altri attributi


        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
            billingResponse.setStatusCode(1);
        }

        // common

        billingResponse.setResultCode(resEnum.getCode());
        billingResponse.setResDescription(resEnum.getDescription());

        // different in every response
        billingResponse.setChargedAmount("0");
        billingResponse.setTransactionId(  getRequest().getTransactionId());

        return billingResponse;
    }

    protected  ResultCodesEnum getByApiCall(int resultCode) {
        switch (resultCode) {
            case 0:
                return ResultCodesEnum.RC1000;


            default:
                return ResultCodesEnum.RC2040;

        }
    }

    // il nome in excel sotto tim mobile pay
    private MPayTotalBillingResponse callOperatorApi() throws  Exception {
        // pdf api
        MPayTotalBillingRequest mPayTotalBillingRequest = new MPayTotalBillingRequest();
            mPayTotalBillingRequest.setMerchantId( cp.getTimMpayMerchantId());
            mPayTotalBillingRequest.setMsisdn(getRequest().getMsisdn().toString());
            mPayTotalBillingRequest.setTransactionId(getRequest().getTransactionId());

        MPayTotalBillingDTO dto = new MPayTotalBillingDTO(mPayTotalBillingRequest);


        String xml = getResources().invokeXmlProxy( dto ).getResult();
        MPayTotalBillingResponse mPayTotalBillingResponse =
                (MPayTotalBillingResponse) JaxbCpUtilities.unmarshall(xml, MPayTotalBillingResponse.class.getName());

        return mPayTotalBillingResponse;
    }
}

