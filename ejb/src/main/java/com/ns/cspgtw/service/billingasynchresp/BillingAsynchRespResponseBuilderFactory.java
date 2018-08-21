package com.ns.cspgtw.service.billingasynchresp;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import com.ns.cspgtw.service.billingasynchresp.BillingAsynchRespResponseBuilderFactory;

public class BillingAsynchRespResponseBuilderFactory extends AbstractFactoryResponseBuilder<BillingAsynchRespResponse, BillingAsynchRespRequest> {

    public BillingAsynchRespResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<BillingAsynchRespResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
