package com.ns.cspgtw.proxylayer.timmobile.mpaytotalbilling;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling.MPayStartWebBillingTransactionRequest;
import com.ns.cspgtw.service.builder.Request;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MPayTotalBillingDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayTotalBilling";

    @Override
    public void reset() {

    }

    public MPayTotalBillingDTO(Request request) {super(MPayTotalBillingDTO.url, request);}

    public MPayTotalBillingDTO(String url, Request request) {

        super(url, request);
    }
    @Override
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException {
        MPayTotalBillingRequest r = (MPayTotalBillingRequest) getRequest();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        if(r.getTransactionId()!=null) params.add(new BasicNameValuePair("TransactionId", r.getTransactionId()));
        if(r.getPromoId()!=null) params.add(new BasicNameValuePair("PromoId", r.getPromoId()));
        if(r.getMerchantId()!=null) params.add(new BasicNameValuePair("MerchantId", r.getMerchantId()));
        if(r.getMsisdn()!=null) params.add(new BasicNameValuePair("Msisdn", r.getMsisdn()));
        if(r.getTransactionType()!=null) params.add(new BasicNameValuePair("TransactionType", r.getTransactionType()));
        if(r.getNotifyUrl()!=null) params.add(new BasicNameValuePair("NotifyUrl", r.getNotifyUrl()));
        if(r.getProductId()!=null) params.add(new BasicNameValuePair("ProductId", r.getProductId()));

        UrlEncodedFormEntity res = new UrlEncodedFormEntity(params);

        return res;
    }
}
