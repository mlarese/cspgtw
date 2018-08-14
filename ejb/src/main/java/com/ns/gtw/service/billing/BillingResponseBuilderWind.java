package com.ns.gtw.service.billing;

import com.ns.gtw.service.CspGtwService;
import com.ns.gtw.service.builder.AbstractBuilder;
import com.ns.gtw.service.builder.Request;
import com.ns.gtw.service.builder.Resources;
import com.ns.gtw.service.enums.ResultCodesEnum;
import com.ns.gtw.model.*;
import com.ns.gtw.proxylayer.ProxyInvokeResult;
import com.ns.gtw.proxylayer.wind.intpb02.IntPb02DTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.URISyntaxException;

public class BillingResponseBuilderWind extends AbstractBuilder<BillingResponse, BillingRequest> {
    private static final Logger logger = LoggerFactory.getLogger(BillingResponseBuilderWind.class);
    private Cp cp=null;
    private Service service=null;
    private Billingid billingid=null;
    private ServiceBillingid serviceBillingid=null;
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
           logger.info("found Service " + service );
        }
        return service;
    }
    public Billingid getBillingid() {
        if(billingid==null) {
           billingid = getResources().getBillingidCrud().find(getRequest().getBillingId());
        }
        return billingid;
    }
    public ServiceBillingid getServiceBillingid() {
        if(serviceBillingid==null) {
            serviceBillingid = getResources().getServiceBillingidCrud().findByServiceAndBilling(getRequest().getServiceId(),getRequest().getBillingId());
        }
        return serviceBillingid;
    }
    public Operator getOperator() {
        if(operator==null) {
           operator = getResources().getOperatorCrud().find(getRequest().getOperatorId());
           logger.info("found  operator = " + operator.getOperatorName());
        }

        return operator;
    }
    public BillingResponseBuilderWind(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public BillingResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1002;

        try {
            ProxyInvokeResult invokeResult = callOperatorApi();
            int apiRes = invokeResult.getResult();
            int statusCode = (apiRes == 0) ? 0 : 1;
            resEnum = getByApiCall(statusCode);

            return new BillingResponse(
                 statusCode,
                 resEnum.getCode(),
                 resEnum.getDescription(),
                 getRequest().getTransactionId(),
                 "0"
            );

        }catch (Exception e) {
            resEnum = ResultCodesEnum.RC2000;

            logger.info("error build = ",e);
            return new BillingResponse(
                    1,
                    resEnum.getCode(),
                    resEnum.getDescription(),
                    getRequest().getTransactionId(),
                    "0"
            );
        }

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

    public static void main(String[] args) {
        System.out.println( getByApiCall(44).getCode()  );
    }

    protected boolean needServiceBillingId () {
        return getRequest().getBillingId() != null;
    }

    private ProxyInvokeResult callOperatorApi() throws  Exception {
        IntPb02DTO dto = new IntPb02DTO(  IntPb02DTO.url   );
        BillingRequest r = getRequest();
        dto.setMtUser( getCp().getWindPbMtUser())
           .setMtPass( getCp().getWindPbMtPwd())
           .setMtCarrier(getOperator().getWindMtCarrier())
           .setMtId(r.getTransactionId())
           .setMtUdh(getService().getWindMtUdh())
           .setPbCcid(r.getAutorizationId())
           .setMtSource(getService().getWindMtSource())
           .setMtTarget( r.getMsisdn())
           .setMtBodycount( 0 )
           .setMtServtype(r.getBillingId())
           .setMtReqsource(getService().getWindMtReqsource())
           .setMtFormat( getService().getWindMtReqsource()) ;

            if(needServiceBillingId()) dto.setMtServtype( getServiceBillingid().getWindBillServiceType());

        return getResources().invokeProxy(dto);
    }
}
