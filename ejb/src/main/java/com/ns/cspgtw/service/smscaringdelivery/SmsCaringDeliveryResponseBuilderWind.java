package com.ns.cspgtw.service.smscaringdelivery;

import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.ProxyInvokeResult;
import com.ns.cspgtw.proxylayer.wind.intpb02.IntPb02DTO;

public class SmsCaringDeliveryResponseBuilderWind extends AbstractBuilder<SmsCaringDeliveryResponse, SmsCaringDeliveryRequest> {

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

    public SmsCaringDeliveryResponseBuilderWind(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public SmsCaringDeliveryResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1002;

        try {
            ProxyInvokeResult invokeResult = callOperatorApi();
            int apiRes = invokeResult.getResult();
            int statusCode = (apiRes == 0) ? 0 : 1;
            resEnum = getByApiCall(statusCode);

            return new SmsCaringDeliveryResponse(
                    statusCode,
                    resEnum.getCode(),
                    resEnum.getDescription(),
                    getRequest().getCpTransactionId()
            );

        }catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;

            return new SmsCaringDeliveryResponse(
                    1,
                    resEnum.getCode(),
                    resEnum.getDescription(),
                    getRequest().getCpTransactionId()
            );
        }

    }

    private ProxyInvokeResult callOperatorApi() throws  Exception {
        IntPb02DTO dto = new IntPb02DTO(  IntPb02DTO.url   );
        SmsCaringDeliveryRequest r = getRequest();

        dto
                .setMtUser( getCp().getWindPbMtUser())
                .setMtPass( getCp().getWindPbMtPwd())
                .setMtCarrier(getOperator().getWindMtCarrier())
                .setMtId(r.getCpTransactionId())
                .setMtUdh(getService().getWindMtUdh())
                .setMtSource(getService().getWindMtSource())
                .setMtTarget( r.getMsisdn())
                .setMtBodycount( 1 )
                .setMtServtype(service.getWindCaringServiceType())
                .setMtReqsource(getService().getWindMtReqsource())
                .setMtFormat( getService().getWindMtReqsource())
                .setMtBody1(getRequest().getBody())
        ;

        return getResources().invokeProxy(dto);
    }

    protected static ResultCodesEnum getByApiCall (int resultCode) {
        switch (resultCode) {
            case 0 : return ResultCodesEnum.RC1002;

            case 21: return ResultCodesEnum.RC3010;

            case 32: return ResultCodesEnum.RC2050;

            case 51:
            case 53:
            case 58: return ResultCodesEnum.RC4050;

            case 44:
            case 63: return ResultCodesEnum.RC3020;

            case 65: return ResultCodesEnum.RC4070;

            case 97:
            case 99: return ResultCodesEnum.RC2050;

            default: return ResultCodesEnum.RC2040;
        }
    }
}
