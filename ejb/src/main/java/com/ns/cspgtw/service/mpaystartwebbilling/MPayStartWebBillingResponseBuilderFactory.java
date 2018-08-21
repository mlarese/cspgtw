package com.ns.cspgtw.service.mpaystartwebbilling;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import com.ns.cspgtw.service.mpaystartwebbilling.MPayStartWebBillingResponseBuilderFactory;

public class MPayStartWebBillingResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPayStartWebBillingResponse, MPayStartWebBillingRequest> {

    public MPayStartWebBillingResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPayStartWebBillingResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
