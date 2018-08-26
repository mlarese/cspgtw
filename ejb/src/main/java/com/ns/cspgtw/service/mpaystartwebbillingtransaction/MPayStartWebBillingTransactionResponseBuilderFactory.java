package com.ns.cspgtw.service.mpaystartwebbillingtransaction;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class MPayStartWebBillingTransactionResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPayStartWebBillingTransactionResponse, MPayStartWebBillingTransactionRequest> {

    public MPayStartWebBillingTransactionResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPayStartWebBillingTransactionResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
