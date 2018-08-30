package com.ns.cspgtw.service.api.retrievemsisdn;

import com.ns.cspgtw.helpers.JaxbCpUtilities;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.timmobile.mpayretrievemsisdn.MPayRetrieveMsisdnDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpayretrievemsisdn.MPayRetrieveMsisdnRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpayretrievemsisdn.MPayRetrieveMsisdnResponse;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class RetrieveMsisdnResponseBuilderTim extends AbstractBuilder<RetrieveMsisdnResponse, RetrieveMsisdnRequest> {

    //  database start
    private Operator operator=null;

    public Operator getOperator() {
        if(operator==null) {
            operator = getResources().getOperatorCrud().find(getRequest().getOperatorId());

        }

        return operator;
    }


    public RetrieveMsisdnResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public RetrieveMsisdnResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1003;
        RetrieveMsisdnResponse retrieveMsisdnResponse = new RetrieveMsisdnResponse();

        try {
            MPayRetrieveMsisdnResponse mPayRetrieveMsisdnResponse = callOperatorApi();

            // response
            if(mPayRetrieveMsisdnResponse.getResultCode().equals("0"))
                retrieveMsisdnResponse.setStatusCode(0);
            else
                retrieveMsisdnResponse.setStatusCode(1);

            resEnum = getByApiCall(  new Integer(mPayRetrieveMsisdnResponse.getResultCode()));



        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
            retrieveMsisdnResponse.setStatusCode(1);
        }


        retrieveMsisdnResponse.setResultCode(resEnum.getCode());

        retrieveMsisdnResponse.setMsisdn("0");

        return retrieveMsisdnResponse;
    }

    protected  ResultCodesEnum getByApiCall(int resultCode) {
        switch (resultCode) {
            case 0:
                return ResultCodesEnum.RC1000;


            default:
                return ResultCodesEnum.RC2040;

        }
    }


    private MPayRetrieveMsisdnResponse callOperatorApi() throws  Exception {
        MPayRetrieveMsisdnRequest mPayRetrieveMsisdnRequest = new MPayRetrieveMsisdnRequest();
        mPayRetrieveMsisdnRequest.setTransactionId(getRequest().getTransactionId());

        MPayRetrieveMsisdnDTO dto = new MPayRetrieveMsisdnDTO(mPayRetrieveMsisdnRequest);


        String xml = getResources().invokeXmlProxy( dto ).getResult();
        MPayRetrieveMsisdnResponse mPayRetrieveMsisdnResponse =
                (MPayRetrieveMsisdnResponse) JaxbCpUtilities.unmarshall(xml, MPayRetrieveMsisdnResponse.class);

        return mPayRetrieveMsisdnResponse;
    }
}

