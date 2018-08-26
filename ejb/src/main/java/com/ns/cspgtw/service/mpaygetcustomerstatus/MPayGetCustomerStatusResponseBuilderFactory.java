package com.ns.cspgtw.service.mpaygetcustomerstatus;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class MPayGetCustomerStatusResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPayGetCustomerStatusResponse, MPayGetCustomerStatusRequest> {

    public MPayGetCustomerStatusResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPayGetCustomerStatusResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
