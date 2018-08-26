package com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.service.builder.Request;

public class MPayCompleteBillingTransactionDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayCompleteBillingTransaction";


    @Override
    public void reset() {

    }

    public MPayCompleteBillingTransactionDTO(Request request) {
        super(MPayCompleteBillingTransactionDTO.url, request);
    }

    public MPayCompleteBillingTransactionDTO(String url, Request request) {

        super(url, request);


    }

}
