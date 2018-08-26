package com.ns.cspgtw.proxylayer.timmobile.mpaysplitbilling;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.service.builder.Request;

public class MPaySplitBillingDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling";

    @Override
    public void reset() {

    }

    public MPaySplitBillingDTO(Request request) {super(MPaySplitBillingDTO.url, request);}

    public MPaySplitBillingDTO(String url, Request request) {

        super(url, request);
    }
}
