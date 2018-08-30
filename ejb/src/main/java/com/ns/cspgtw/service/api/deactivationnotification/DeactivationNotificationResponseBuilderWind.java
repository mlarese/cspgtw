package com.ns.cspgtw.service.api.deactivationnotification;

import com.ns.cspgtw.proxylayer.wind.IntProv03DTO;
import com.ns.cspgtw.proxylayer.wind.IntProv26DTO;
import com.ns.cspgtw.service.api.billingasynchresp.BillingAsynchRespRequest;
import com.ns.cspgtw.service.api.billingasynchresp.BillingAsynchRespResponse;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class DeactivationNotificationResponseBuilderWind extends AbstractBuilder<DeactivationNotificationResponse, DeactivationNotificationRequest> {

    public DeactivationNotificationResponseBuilderWind(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public DeactivationNotificationResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1002;
        try {
            int invokeResult = callOperatorApi();
        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
        }


        DeactivationNotificationResponse deactivationNotificationResponse = new DeactivationNotificationResponse();
        // deactivationNotificationResponse.setResultCode(0);

        return deactivationNotificationResponse;
    }

    protected static ResultCodesEnum getByApiCall (int resultCode) {
        switch (resultCode) {
            case 0 : return ResultCodesEnum.RC1002;
            default: return ResultCodesEnum.RC2040;
        }
    }

    private int callOperatorApi() throws Exception {
        // dto is the request
        IntProv26DTO dto = new IntProv26DTO(  IntProv26DTO.url   );


        dto
            .setMt_carrier(  getRequest().getMtCarrier())
            .setMt_authID( getRequest().getMtAuthId())
            .setMt_params(getRequest().getMtParams())
            .setMt_params(getRequest().getMtTarget())
            .setMt_servtype(getRequest().getMtServType())
            .setMt_target(getRequest().getMtTarget())
            .setMt_paramName1(getRequest().getMtParamName1())
            .setMt_paramName2(getRequest().getMtParamName2())
            .setMt_paramName3(getRequest().getMtParamName3())
            .setMt_paramName4(getRequest().getMtParamName4())
            .setMt_paramValue1(getRequest().getMtParamValue1())
            .setMt_paramValue2(getRequest().getMtParamValue2())
            .setMt_paramValue3(getRequest().getMtParamValue3())
            .setMt_paramValue4(getRequest().getMtParamValue4())
        ;

        return getResources().invokeProxy(dto).getResult();

    }
}
