package com.ns.cspgtw.proxylayer.timmobile.mpaynotifyunsubscribecustomer;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.service.builder.Request;

public class MPayNotifyUnsubscribeCustomerDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayNotifyUnsubscribeCustomer";

    @Override
    public void reset() {

    }

    public MPayNotifyUnsubscribeCustomerDTO(Request request) {super(MPayNotifyUnsubscribeCustomerDTO.url, request);}

    public MPayNotifyUnsubscribeCustomerDTO(String url, Request request) {

        super(url, request);
    }
}
