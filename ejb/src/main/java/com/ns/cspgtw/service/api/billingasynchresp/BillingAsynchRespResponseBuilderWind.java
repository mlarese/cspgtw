package com.ns.cspgtw.service.api.billingasynchresp;

import com.ns.cspgtw.proxylayer.ProxyInvokeResult;
import com.ns.cspgtw.proxylayer.wind.IntPb02DTO;
import com.ns.cspgtw.proxylayer.wind.intProv03DTO;
import com.ns.cspgtw.service.api.smscaringdelivery.SmsCaringDeliveryRequest;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class BillingAsynchRespResponseBuilderWind extends AbstractBuilder<BillingAsynchRespResponse, BillingAsynchRespRequest> {

    public BillingAsynchRespResponseBuilderWind(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public BillingAsynchRespResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1002;
        try {
            int invokeResult = callOperatorApi();
            return null;
        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
        }


        BillingAsynchRespResponse billingAsynchRespResponse = new BillingAsynchRespResponse();
        billingAsynchRespResponse.setResultCode(0);

        return billingAsynchRespResponse;
    }

    protected static ResultCodesEnum getByApiCall (int resultCode) {
        switch (resultCode) {
            case 0 : return ResultCodesEnum.RC1002;
            default: return ResultCodesEnum.RC2040;
        }
    }

    private int callOperatorApi()  {
        // dto is the request
        intProv03DTO dto = new intProv03DTO(  IntPb02DTO.url   );


        dto
            .setMtId( getRequest().getMtId())
            .setArErrorcode(getRequest().getArErrorCode())
            .setMtAuthcode(getRequest().getMtAuthCode())
            .setMtTarget(getRequest().getMtTarget())
        ;

        // chiama api wind e restituisce un numero
        return getResources().invokeProxy(dto).getResult();

    }
}
