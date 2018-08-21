package com.ns.cspgtw.service.mpaycompletebilling;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import com.ns.cspgtw.service.mpaycompletebilling.MPayCompleteBillingResponseBuilderFactory;

public class MPayCompleteBillingResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPayCompleteBillingResponse, MPayCompleteBillingRequest> {

    public MPayCompleteBillingResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPayCompleteBillingResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
