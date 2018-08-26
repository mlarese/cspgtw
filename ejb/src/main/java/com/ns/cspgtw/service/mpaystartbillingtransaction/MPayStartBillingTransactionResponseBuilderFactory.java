package com.ns.cspgtw.service.mpaystartbillingtransaction;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class MPayStartBillingTransactionResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPayStartBillingTransactionResponse, MPayStartBillingTransactionRequest> {

    public MPayStartBillingTransactionResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPayStartBillingTransactionResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
