package com.ns.cspgtw.service.smscaringdelivery;

import com.ns.cspgtw.service.billing.BillingResponse;
import com.ns.cspgtw.service.builder.*;
import com.ns.cspgtw.service.enums.OperatorsEnum;
import com.ns.cspgtw.service.smscaringdelivery.SmsCaringDeliveryResponseBuilderFactory;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class SmsCaringDeliveryResponseBuilderFactory extends AbstractFactoryResponseBuilder<SmsCaringDeliveryResponse, SmsCaringDeliveryRequest> {

    public SmsCaringDeliveryResponseBuilderFactory(Resources resources, Request request) {
        super(resources, request);
    }


    @Override
    public Builder<SmsCaringDeliveryResponse> getBuilder() {
        try {
            Boolean isWind = OperatorsEnum.WIND.isEqual(getRequest().getOperatorId());
            if(isWind) return new SmsCaringDeliveryResponseBuilderWind( getResources(), getRequest());

            Boolean isTim = OperatorsEnum.TIM.isEqual(getRequest().getOperatorId());
            if(isTim) return new SmsCaringDeliveryResponseBuilderTim(getResources(), getRequest());
        } catch (Exception e) {
            return errorResponseBuilder(ResultCodesEnum.RC2020, getRequest().getCpTransactionId());
        }

        return errorResponseBuilder(ResultCodesEnum.RC2020, getRequest().getCpTransactionId());
    }

    public Builder errorResponseBuilder(ResultCodesEnum resEnum) {
        return errorResponseBuilder(resEnum, getRequest().getCpTransactionId());
    }

    public static Builder errorResponseBuilder(ResultCodesEnum resEnum, String transactionId) {
        SmsCaringDeliveryResponse response = new SmsCaringDeliveryResponse(
                1,
                resEnum.getCode(),
                resEnum.getDescription(),
                transactionId
        );

        return new SimpleBuilder(response);
    }
}
