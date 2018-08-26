package com.ns.cspgtw.service.api.retrieverefund;

import com.ns.cspgtw.service.retrieverefund.RetrieveRefundResponseBuilderFactory;
import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class RetrieveRefundResponseBuilderFactory extends AbstractFactoryResponseBuilder<RetrieveRefundResponse, RetrieveRefundRequest> {

    public RetrieveRefundResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<RetrieveRefundResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
