package com.ns.cspgtw.service.api.mpaycompletebilling;

import com.ns.cspgtw.helpers.JaxbCpUtilities;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling.MPayCompleteBillingTransactionDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling.MPayCompleteBillingTransactionRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling.MPayCompleteBillingTransactionResponse;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class MPayCompleteBillingResponseBuilderTim extends AbstractBuilder<MPayCompleteBillingResponse, MPayCompleteBillingRequest> {

    private Cp cp=null;
    private Operator operator=null;

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


    public MPayCompleteBillingResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public MPayCompleteBillingResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1003;
        MPayCompleteBillingResponse mPayCompleteBillingResponse = new MPayCompleteBillingResponse();

        try {
            MPayCompleteBillingTransactionResponse mPayCompleteBillingTransactionResponse = callOperatorApi();

            // response
            if(mPayCompleteBillingTransactionResponse.getResultCode().equals("0"))
                mPayCompleteBillingResponse.setStatusCode(0);
            else
                mPayCompleteBillingResponse.setStatusCode(1);

            resEnum = getByApiCall(  new Integer(mPayCompleteBillingTransactionResponse.getResultCode()));


        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
            mPayCompleteBillingResponse.setStatusCode(1);
        }



        mPayCompleteBillingResponse.setResultCode(resEnum.getCode());

        mPayCompleteBillingResponse.setMsisdn("0");

        return mPayCompleteBillingResponse;
    }

    protected  ResultCodesEnum getByApiCall(int resultCode) {
        switch (resultCode) {
            case 0:
                return ResultCodesEnum.RC1000;


            default:
                return ResultCodesEnum.RC2040;

        }
    }

    private MPayCompleteBillingTransactionResponse callOperatorApi() throws  Exception {
        MPayCompleteBillingTransactionRequest mPayCompleteBillingTransactionRequest = new MPayCompleteBillingTransactionRequest();
        mPayCompleteBillingTransactionRequest.setStatusCode(getRequest().getStatusCode().toString());
        mPayCompleteBillingTransactionRequest.setTransactionId(getRequest().getTransactionId());

        MPayCompleteBillingTransactionDTO dto = new MPayCompleteBillingTransactionDTO(mPayCompleteBillingTransactionRequest);


        String xml = getResources().invokeXmlProxy( dto ).getResult();
        MPayCompleteBillingTransactionResponse mPayTotalBillingResponse =
                (MPayCompleteBillingTransactionResponse) JaxbCpUtilities.unmarshall(xml, MPayCompleteBillingTransactionResponse.class);

        return mPayTotalBillingResponse;
    }
}

