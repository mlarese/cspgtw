package com.ns.cspgtw.proxylayer.timmobile.mpaysplitbilling;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling.MPayStartWebBillingTransactionRequest;
import com.ns.cspgtw.service.builder.Request;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

public class MPaySplitBillingDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPaySplitBilling";

    @Override
    public void reset() {

    }

    public MPaySplitBillingDTO(Request request) {super(MPaySplitBillingDTO.url, request);}

    public MPaySplitBillingDTO(String url, Request request) {

        super(url, request);
    }

    @Override
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException {
        MPaySplitBillingRequest r = (MPaySplitBillingRequest) getRequest();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        if(r.getFractionId()!=null) params.add(new BasicNameValuePair("FranctionId", r.getFractionId()));
        if(r.getMerchantId()!=null) params.add(new BasicNameValuePair("MerchantId", r.getMerchantId()));
        if(r.getMsisdn()!=null) params.add(new BasicNameValuePair("MSISDN", r.getMsisdn()));
        if(r.getNotifyUrl()!=null) params.add(new BasicNameValuePair("NotifyUrl", r.getNotifyUrl()));
        if(r.getProductId()!=null) params.add(new BasicNameValuePair("ProductId", r.getProductId()));
        if(r.getSubTransactionId()!=null) params.add(new BasicNameValuePair("SubTransactionId", r.getSubTransactionId()));
        if(r.getTransactionId()!=null) params.add(new BasicNameValuePair("TransactionId", r.getTransactionId()));
        if(r.getTransactionType()!=null) params.add(new BasicNameValuePair("TransactionType", r.getTransactionType()));
        UrlEncodedFormEntity res = new UrlEncodedFormEntity(params);

        return res;
    }
}
