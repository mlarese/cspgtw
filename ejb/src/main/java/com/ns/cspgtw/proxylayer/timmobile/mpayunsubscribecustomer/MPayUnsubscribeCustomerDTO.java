package com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.service.builder.Request;

public class MPayUnsubscribeCustomerDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer";

    @Override
    public void reset() {

    }

    public MPayUnsubscribeCustomerDTO(Request request) {super(MPayUnsubscribeCustomerDTO.url, request);}

    public MPayUnsubscribeCustomerDTO(String url, Request request) {

        super(url, request);
    }
}
