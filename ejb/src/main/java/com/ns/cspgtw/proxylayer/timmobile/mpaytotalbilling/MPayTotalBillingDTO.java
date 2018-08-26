package com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.service.builder.Request;

public class MPayTotalBillingDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling";

    @Override
    public void reset() {

    }

    public MPayTotalBillingDTO(Request request) {super(MPayTotalBillingDTO.url, request);}

    public MPayTotalBillingDTO(String url, Request request) {

        super(url, request);
    }
}
