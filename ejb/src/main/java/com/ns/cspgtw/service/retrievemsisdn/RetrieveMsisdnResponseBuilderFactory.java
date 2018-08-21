package com.ns.cspgtw.service.retrievemsisdn;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import com.ns.cspgtw.service.retrievemsisdn.RetrieveMsisdnResponseBuilderFactory;

public class RetrieveMsisdnResponseBuilderFactory extends AbstractFactoryResponseBuilder<RetrieveMsisdnResponse, RetrieveMsisdnRequest> {

    public RetrieveMsisdnResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<RetrieveMsisdnResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
