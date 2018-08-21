package com.ns.cspgtw.service.activation;

import com.ns.cspgtw.service.builder.*;
import com.ns.cspgtw.service.enums.OperatorsEnum;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class ActivationResponseBuilderFactory extends AbstractFactoryResponseBuilder<ActivationResponse, ActivationRequest> {

    public ActivationResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<ActivationResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
