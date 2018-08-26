package com.ns.cspgtw.service.mpayunscribecustomer;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class MPayUnsubscribeCustomerResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPayUnsubscribeCustomerResponse, MPayUnsubscribeCustomerRequest> {

    public MPayUnsubscribeCustomerResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPayUnsubscribeCustomerResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
