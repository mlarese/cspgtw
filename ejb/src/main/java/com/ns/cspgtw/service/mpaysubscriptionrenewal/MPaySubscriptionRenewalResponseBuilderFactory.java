package com.ns.cspgtw.service.mpaysubscriptionrenewal;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class MPaySubscriptionRenewalResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPaySubscriptionRenewalResponse, MPaySubscriptionRenewalRequest> {

    public MPaySubscriptionRenewalResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPaySubscriptionRenewalResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
