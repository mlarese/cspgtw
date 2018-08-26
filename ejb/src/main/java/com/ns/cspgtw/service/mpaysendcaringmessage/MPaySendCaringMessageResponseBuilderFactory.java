package com.ns.cspgtw.service.mpaysendcaringmessage;

import com.ns.cspgtw.service.builder.AbstractFactoryResponseBuilder;
import com.ns.cspgtw.service.builder.Builder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class MPaySendCaringMessageResponseBuilderFactory extends AbstractFactoryResponseBuilder<MPaySendCaringMessageResponse, MPaySendCaringMessageRequest> {

    public MPaySendCaringMessageResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<MPaySendCaringMessageResponse> getBuilder() {


        return null;

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {

        return null;

    }
}
