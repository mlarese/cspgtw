package com.ns.cspgtw.service.api.deactivationnotification;

import com.ns.cspgtw.helpers.JaxbCpUtilities;
import com.ns.cspgtw.model.*;
import com.ns.cspgtw.proxylayer.timmobile.mpaynotifyunsubscribecustomer.MPayNotifyUnsubscribeCustomerDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaynotifyunsubscribecustomer.MPayNotifyUnsubscribeCustomerRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpaynotifyunsubscribecustomer.MPayNotifyUnsubscribeCustomerResponse;
import com.ns.cspgtw.service.builder.AbstractBuilder;
import com.ns.cspgtw.service.builder.Request;
import com.ns.cspgtw.service.builder.Resources;
import com.ns.cspgtw.service.enums.ResultCodesEnum;

public class DeactivationNotificationResponseBuilderTim extends AbstractBuilder<DeactivationNotificationResponse, DeactivationNotificationRequest> {

    //  database start
    private Cp cp=null;
    private Service service=null;
    private Billingid billingid=null;
    private ServiceBillingid serviceBillingid=null;
    private Operator operator=null;


    public DeactivationNotificationResponseBuilderTim(Resources resources, Request request) {
        super(resources, request);
    }

    @Override
    public DeactivationNotificationResponse build() {
        ResultCodesEnum resEnum = ResultCodesEnum.RC1003; // immutable
        DeactivationNotificationResponse deactivationNotificationResponse = new DeactivationNotificationResponse(); // excel response


        return deactivationNotificationResponse;
    }



    private MPayNotifyUnsubscribeCustomerResponse callOperatorApi() throws  Exception {

        MPayNotifyUnsubscribeCustomerRequest mPayNotifyUnsubscribeCustomerRequest = new MPayNotifyUnsubscribeCustomerRequest();
        mPayNotifyUnsubscribeCustomerRequest.setProductId( service.getTimMpayProductId().toString());
        mPayNotifyUnsubscribeCustomerRequest.setMsisdn(getRequest().getMsisdn().toString());


        MPayNotifyUnsubscribeCustomerDTO dto = new MPayNotifyUnsubscribeCustomerDTO(mPayNotifyUnsubscribeCustomerRequest);


        String xml = getResources().invokeXmlProxy( dto ).getResult();
        MPayNotifyUnsubscribeCustomerResponse mPayNotifyUnsubscribeCustomerResponse =
                (MPayNotifyUnsubscribeCustomerResponse) JaxbCpUtilities.unmarshall(xml, MPayNotifyUnsubscribeCustomerResponse.class);

        return mPayNotifyUnsubscribeCustomerResponse;
    }
}

