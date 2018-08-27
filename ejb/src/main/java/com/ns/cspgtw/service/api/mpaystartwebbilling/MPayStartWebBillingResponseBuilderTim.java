package com.ns.cspgtw.service.api.mpaystartwebbilling;

import com.ns.cspgtw.helpers.JaxbHelpers;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling.MPayStartWebBillingTransactionDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling.MPayStartWebBillingTransactionRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling.MPayStartWebBillingTransactionResponse;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class MPayStartWebBillingResponseBuilderTim extends AbstractBuilder<MPayStartWebBillingResponse, MPayStartWebBillingRequest> {

    //  database start
    private Cp cp=null;
    private Operator operator=null;
    private Service service=null;

    public Cp getCp() {
        if(cp==null){
            cp = getResources().getCpCrud().find(getRequest().getCpId());
        }
        return cp;
    }

    public Operator getOperator() {
        if(operator==null) {
            operator = getResources().getOperatorCrud().find(getRequest().getOperatorId());

        }

        return operator;
    }

    //  database end

    public MPayStartWebBillingResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public MPayStartWebBillingResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1003;
        MPayStartWebBillingResponse mPayStartWebBillingResponse = new MPayStartWebBillingResponse();

        try {
            MPayStartWebBillingTransactionResponse mPayStartWebBillingTransactionResponse = callOperatorApi();

            // response
            if(mPayStartWebBillingTransactionResponse.getResultCode().equals("0"))
                mPayStartWebBillingResponse.setStatusCode(0);
            else
                mPayStartWebBillingResponse.setStatusCode(1);

            resEnum = getByApiCall(  new Integer(mPayStartWebBillingResponse.getResultCode()));


        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
            mPayStartWebBillingResponse.setStatusCode(1);
        }

        // common

        mPayStartWebBillingResponse.setResultCode(resEnum.getCode());
        mPayStartWebBillingResponse.setPaymentUrl(resEnum.getCode());


        mPayStartWebBillingResponse.setTransactionId(  getRequest().g());

        return mPayStartWebBillingResponse;
    }

    protected  ResultCodesEnum getByApiCall(int resultCode) {
        switch (resultCode) {
            case 0:
                return ResultCodesEnum.RC1000;


            default:
                return ResultCodesEnum.RC2040;

        }
    }

    private MPayStartWebBillingTransactionResponse callOperatorApi() throws  Exception {
        // pdf api
        MPayStartWebBillingTransactionRequest mPayStartWebBillingTransactionRequest = new MPayStartWebBillingTransactionRequest();
            mPayStartWebBillingTransactionRequest.setMerchantId( cp.getTimMpayMerchantId());
            mPayStartWebBillingTransactionRequest.setProductId( service.getTimMpayProductId().toString());
            mPayStartWebBillingTransactionRequest.setProductDescription(getRequest().getProductDescription());
            mPayStartWebBillingTransactionRequest.setPlatFormId("WAP");
            mPayStartWebBillingTransactionRequest.setMsisdn(getRequest().getMsisdn());
            mPayStartWebBillingTransactionRequest.setCallBackUrl(getRequest().getCallBackUrl());


        MPayStartWebBillingTransactionDTO dto = new MPayStartWebBillingTransactionDTO(mPayStartWebBillingTransactionRequest);


        String xml = getResources().invokeXmlProxy( dto ).getResult();
        MPayStartWebBillingTransactionResponse mPayStartWebBillingTransactionResponse =
                (MPayStartWebBillingTransactionResponse) JaxbHelpers.unmarshall(xml, MPayStartWebBillingTransactionResponse.class.getName());

        return mPayStartWebBillingTransactionResponse;
    }
}

