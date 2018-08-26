package com.ns.cspgtw.service.mpaycompletebillingtransaction;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;


public class MPayCompleteBillingTransactionResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPayCompleteBillingTransactionResponse, MPayCompleteBillingTransactionRequest> {

    public MPayCompleteBillingTransactionResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPayCompleteBillingTransactionResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
