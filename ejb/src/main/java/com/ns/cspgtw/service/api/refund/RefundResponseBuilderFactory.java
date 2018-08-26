package com.ns.cspgtw.service.api.refund;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import com.ns.cspgtw.service.refund.RefundResponseBuilderFactory;

public class RefundResponseBuilderFactory extends AbstractFactoryResponseBuilder<RefundResponse, RefundRequest> {

    public RefundResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<RefundResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
