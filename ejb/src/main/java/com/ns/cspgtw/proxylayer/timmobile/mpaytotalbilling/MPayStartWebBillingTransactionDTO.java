package com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.service.builder.Request;

public class MPayStartWebBillingTransactionDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayStartWebBillingTransaction";


    @Override
    public void reset() {

    }

    public MPayStartWebBillingTransactionDTO(Request request) {
        super(MPayStartWebBillingTransactionDTO.url, request);
    }

    public MPayStartWebBillingTransactionDTO(String url, Request request) {

        super(url, request);


    }

}
