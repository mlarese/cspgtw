package com.ns.cspgtw.service.deactivation;

import com.ns.cspgtw.service.billing.BillingResponse;
import com.ns.cspgtw.service.billing.BillingResponseBuilderTim;
import com.ns.cspgtw.service.billing.BillingResponseBuilderWind;
import com.ns.cspgtw.service.builder.*;
import com.ns.cspgtw.service.enums.OperatorsEnum;
import com.ns.cspgtw.service.enums.ResultCodesEnum;
import com.ns.cspgtw.service.deactivation.DeactivationResponseBuilderFactory;
import com.ns.gtwcp.model.Cp;
import com.ns.gtwcp.model.Operator;
import com.ns.gtwcp.model.Service;

public class DeactivationResponseBuilderFactory extends AbstractFactoryResponseBuilder<DeactivationResponse, DeactivationRequest> {


    public DeactivationResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<DeactivationResponse> getBuilder() {

        try {
            Boolean isWind = OperatorsEnum.WIND.isEqual(getRequest().getOperatorId());
            if(isWind) return new DeactivationResponseBuilderWind( getResources(), getRequest());

            Boolean isTim = OperatorsEnum.TIM.isEqual(getRequest().getOperatorId());
            if(isTim) return new DeactivationResponseBuilderTim(getResources(), getRequest());
        } catch (Exception e) {
            return errorResponseBuilder(ResultCodesEnum.RC2020, getRequest().getTransactionId());
        }

        return errorResponseBuilder(ResultCodesEnum.RC2020, getRequest().getTransactionId());

    }

    @Override
    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {
        return errorResponseBuilder(resEnum, getRequest().getTransactionId());
    }

    public static Builder errorResponseBuilder(ResultCodesEnum resEnum, String transactionId) {
        Response response = new DeactivationResponse(
                1,
                resEnum.getCode(),
                resEnum.getDescription(),
                transactionId
        );

        return new SimpleBuilder(response);

    }
}
