package com.ns.cspgtw.proxylayer.timmobile.mpayunsubscribecustomer;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaysplitbilling.MPaySplitBillingRequest;
import com.ns.cspgtw.service.builder.Request;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MPayUnsubscribeCustomerDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayUnsubscribeCustomer";

    @Override
    public void reset() {

    }

    public MPayUnsubscribeCustomerDTO(Request request) {super(MPayUnsubscribeCustomerDTO.url, request);}

    public MPayUnsubscribeCustomerDTO(String url, Request request) {

        super(url, request);
    }
    @Override
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException {
        MPayUnsubscribeCustomerRequest r = (MPayUnsubscribeCustomerRequest) getRequest();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        if(r.getMerchantId()!=null) params.add(new BasicNameValuePair("MerchantId", r.getMerchantId()));
        if(r.getMsisdn()!=null) params.add(new BasicNameValuePair("MSISDN", r.getMsisdn()));
        if(r.getProductId()!=null) params.add(new BasicNameValuePair("ProductId", r.getProductId()));
        if(r.getTransactionId()!=null) params.add(new BasicNameValuePair("TransactionId", r.getTransactionId()));

        UrlEncodedFormEntity res = new UrlEncodedFormEntity(params);

        return res;
    }
}
