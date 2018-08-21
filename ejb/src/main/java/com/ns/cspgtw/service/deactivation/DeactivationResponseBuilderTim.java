package com.ns.cspgtw.service.deactivation;

import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.deactivation.DeactivationResponseBuilderTim;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class DeactivationResponseBuilderTim extends AbstractBuilder<DeactivationResponse, DeactivationRequest> {

    public DeactivationResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public DeactivationResponse build() {
        return null;
    }

}
