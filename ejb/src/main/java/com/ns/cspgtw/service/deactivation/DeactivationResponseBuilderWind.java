package com.ns.cspgtw.service.deactivation;

import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import com.ns.cspgtw.model.Cp;
import com.ns.cspgtw.model.Operator;
import com.ns.cspgtw.model.Service;
import com.ns.cspgtw.proxylayer.ProxyInvokeResult;
import com.ns.cspgtw.proxylayer.wind.IntPb23DTO;

import java.io.IOException;
import java.net.URISyntaxException;

public class DeactivationResponseBuilderWind extends AbstractBuilder<DeactivationResponse, DeactivationRequest> {
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

    public DeactivationResponseBuilderWind(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public DeactivationResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1002;
        try {

            ProxyInvokeResult invokeResult = callOperatorApi();
            int apiRes = invokeResult.getResult();
            int statusCode = (apiRes == 0) ? 0 : 1;
            resEnum = getByApiCall(statusCode);

            return new DeactivationResponse(
                statusCode,
                resEnum.getCode(),
                resEnum.getDescription(),
                getRequest().getTransactionId()
            );
        } catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;
            return new DeactivationResponse(
                    1,
                    resEnum.getCode(),
                    resEnum.getDescription(),
                    getRequest().getTransactionId()
            );
        }
    }

    private ProxyInvokeResult callOperatorApi() throws IOException, URISyntaxException, Exception {
        IntPb23DTO dto = new IntPb23DTO(  IntPb23DTO.url   );
        dto
            .setMtCarrier( getOperator().getWindMtCarrier())
            .setMtUser( getCp().getWindPbMtUser())
            .setMtPass( getCp().getWindPbMtPwd())
            .setMtAuthid( getRequest().getAuthorizationId())
            .setMtTarget(getRequest().getMsisdn())
            .setMtServtype(getService().getWindDeactServiceType())
            .setMtParams(4)

            .setMtParamName1("channel_in")
            .setMtParamValue1("CSP-CC")
            .setMtParamName2("sms_line")
            .setMtParamValue2(null)
            .setMtParamName3("channel_out")
            .setMtParamValue3("WAP")
            .setMtParamName4("reason")
            .setMtParamValue4("USER_REQUEST")
        ;
        return getResources().invokeProxy(dto);
    }

    protected static ResultCodesEnum getByApiCall (int resultCode) {
        switch (resultCode) {
            case 0 : return ResultCodesEnum.RC1002;

            case 21: return ResultCodesEnum.RC3010;

            case 32: return ResultCodesEnum.RC2050;
            case 44:
            case 63: return ResultCodesEnum.RC3020;

            case 65: return ResultCodesEnum.RC4070;

            case 97:
            case 99: return ResultCodesEnum.RC2050;

            default: return ResultCodesEnum.RC2040;
        }
    }

}
