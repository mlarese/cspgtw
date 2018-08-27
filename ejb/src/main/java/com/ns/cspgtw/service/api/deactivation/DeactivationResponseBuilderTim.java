package com.ns.cspgtw.service.api.deactivation;

import com.ns.cspgtw.helpers.JaxbHelpers;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingResponse;
import com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer.MPayUnsubscribeCustomerDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer.MPayUnsubscribeCustomerRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer.MPayUnsubscribeCustomerResponse;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class DeactivationResponseBuilderTim extends AbstractBuilder<DeactivationResponse, DeactivationRequest> {

    private Cp cp=null;
    private Service service=null;
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
    public Operator getOperator() {
        if(operator==null) {
            operator = getResources().getOperatorCrud().find(getRequest().getOperatorId());

        }

        return operator;
    }


    public DeactivationResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public DeactivationResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1003;
        DeactivationResponse deactivationResponse = new DeactivationResponse();

        try {
            MPayUnsubscribeCustomerResponse mPayUnsubscribeCustomerResponse = callOperatorApi();

            if(mPayUnsubscribeCustomerResponse.getResultCode().equals("0"))
                deactivationResponse.setStatusCode(0);
            else
                deactivationResponse.setStatusCode(1);

            resEnum = getByApiCall(  new Integer(mPayUnsubscribeCustomerResponse.getResultCode()));



        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
            deactivationResponse.setStatusCode(1);
        }


        deactivationResponse.setResultCode(resEnum.getCode());
        deactivationResponse.setResDescription(resEnum.getDescription());


        deactivationResponse.setTransactionId(  getRequest().getTransactionId());

        return deactivationResponse;
    }

    protected  ResultCodesEnum getByApiCall(int resultCode) {
        switch (resultCode) {
            case 0:
                return ResultCodesEnum.RC1000;


            default:
                return ResultCodesEnum.RC2040;

        }
    }

    private MPayUnsubscribeCustomerResponse callOperatorApi() throws  Exception {
        // pdf api
        MPayUnsubscribeCustomerRequest mPayUnsubscribeCustomerRequest = new MPayUnsubscribeCustomerRequest();
        mPayUnsubscribeCustomerRequest.setMerchantId( cp.getTimMpayMerchantId());
        mPayUnsubscribeCustomerRequest.setMsisdn(getRequest().getMsisdn().toString());
        mPayUnsubscribeCustomerRequest.setTransactionId(getRequest().getTransactionId());
        mPayUnsubscribeCustomerRequest.setProductId( service.getTimMpayProductId().toString());

        MPayUnsubscribeCustomerDTO dto = new MPayUnsubscribeCustomerDTO(mPayUnsubscribeCustomerRequest);


        String xml = getResources().invokeXmlProxy( dto ).getResult();
        MPayUnsubscribeCustomerResponse mPayUnsubscribeCustomerResponse =
                (MPayUnsubscribeCustomerResponse) JaxbHelpers.unmarshall(xml, MPayTotalBillingResponse.class.getName());

        return mPayUnsubscribeCustomerResponse;
    }
}

