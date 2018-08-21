package com.ns.cspgtw.service.billing;

import com.ns.cspgtw.service.builder.*;
import com.ns.cspgtw.service.enums.OperatorsEnum;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class BillingResponseBuilderFactory extends AbstractFactoryResponseBuilder<BillingResponse, BillingRequest> {

    public BillingResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<BillingResponse> getBuilder() {
        try {
            Boolean isWind = OperatorsEnum.WIND.isEqual(getRequest().getOperatorId());
            if(isWind) return new BillingResponseBuilderWind( getResources(), getRequest());

            Boolean isTim = OperatorsEnum.TIM.isEqual(getRequest().getOperatorId());
            if(isTim) return new BillingResponseBuilderTim(getResources(), getRequest());
        } catch (Exception e) {
            return errorResponseBuilder(ResultCodesEnum.RC2020, getRequest().getTransactionId());
        }

        return errorResponseBuilder(ResultCodesEnum.RC2020, getRequest().getTransactionId());
    }

    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {
        return errorResponseBuilder(resEnum, getRequest().getTransactionId());
    }

    public static Builder errorResponseBuilder(ResultCodesEnum resEnum, String transactionId) {
        BillingResponse response = new BillingResponse(
                1,
                resEnum.getCode(),
                resEnum.getDescription(),
                transactionId,
                "0"
        );

        return new SimpleBuilder(response);

    }


}
