package com.ns.cspgtw.service.api.deactivationnotification;

import com.ns.cspgtw.helpers.JaxbHelpers;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling.MPayTotalBillingResponse;
import com.ns.cspgtw.service.api.billing.BillingRequest;
import com.ns.cspgtw.service.api.billing.BillingResponse;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class DeactivationNotificationResponseBuilderTim extends AbstractBuilder<DeactivationNotificationResponse, DeactivationNotificationRequest> {

    //  database start
    private Cp cp=null;
    private Service service=null;
    private Billingid billingid=null;
    private ServiceBillingid serviceBillingid=null;
    private Operator operator=null;

    public Service getService() {
        if(service==null) {
            service = getResources().getServiceCrud().find(getRequest().getServiceId());
        }
        return service;
    }



    public DeactivationNotificationResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public DeactivationNotificationResponse build() {
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


    private MPayTotalBillingResponse callOperatorApi() throws  Exception {

        MPayTotalBillingRequest mPayTotalBillingRequest = new MPayTotalBillingRequest();
            mPayTotalBillingRequest.setMerchantId( cp.getTimMpayMerchantId());
            mPayTotalBillingRequest.setMsisdn(getRequest().getMsisdn().toString());
            mPayTotalBillingRequest.setTransactionId(getRequest().getTransactionId());

        MPayTotalBillingDTO dto = new MPayTotalBillingDTO(mPayTotalBillingRequest);


        String xml = getResources().invokeXmlProxy( dto ).getResult();
        MPayTotalBillingResponse mPayTotalBillingResponse =
                (MPayTotalBillingResponse) JaxbHelpers.unmarshall(xml, MPayTotalBillingResponse.class.getName());

        return mPayTotalBillingResponse;
    }
}

