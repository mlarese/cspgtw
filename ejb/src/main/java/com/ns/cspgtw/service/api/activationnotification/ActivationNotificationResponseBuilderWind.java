package com.ns.cspgtw.service.api.activationnotification;

import com.ns.cspgtw.proxylayer.wind.IntProv03DTO;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class ActivationNotificationResponseBuilderWind extends AbstractBuilder<ActivationNotificationResponse, ActivationNotificationRequest> {

    public ActivationNotificationResponseBuilderWind(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public ActivationNotificationResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1002;
        try {
            int invokeResult = callOperatorApi();
        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
        }


        ActivationNotificationResponse activationNotificationResponse = new ActivationNotificationResponse();
        activationNotificationResponse.setResultCode(0);

        return activationNotificationResponse;
    }

    protected static ResultCodesEnum getByApiCall (int resultCode) {
        switch (resultCode) {
            case 0 : return ResultCodesEnum.RC1002;
            default: return ResultCodesEnum.RC2040;
        }
    }

    private int callOperatorApi() throws Exception {
        // dto is the request
        IntProv03DTO dto = new IntProv03DTO(  IntProv03DTO.url   );


        dto
                .setMtId(  getRequest().getMtId())
                .setArErrorcode( getRequest().getArErrorCode())
                .setMtAuthcode(getRequest().getMtAuthCode())
                .setMtTarget(getRequest().getMtTarget())
        ;

        return getResources().invokeProxy(dto).getResult();

    }
}
