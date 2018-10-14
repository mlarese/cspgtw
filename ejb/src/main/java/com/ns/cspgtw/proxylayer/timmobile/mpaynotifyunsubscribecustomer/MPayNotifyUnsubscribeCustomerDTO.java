package com.ns.cspgtw.proxylayer.timmobile.mpaynotifyunsubscribecustomer;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling.MPayStartWebBillingTransactionRequest;
import com.ns.cspgtw.service.builder.Request;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;


public class MPayNotifyUnsubscribeCustomerDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayNotifyUnsubscribeCustomerResponse";

    @Override
    public void reset() {

    }

    public MPayNotifyUnsubscribeCustomerDTO(Request request) {super(MPayNotifyUnsubscribeCustomerDTO.url, request);}

    public MPayNotifyUnsubscribeCustomerDTO(String url, Request request) {

        super(url, request);
    }

    @Override
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException {
        MPayNotifyUnsubscribeCustomerRequest r = (MPayNotifyUnsubscribeCustomerRequest) getRequest();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        if(r.getMerchantId()!=null) params.add(new BasicNameValuePair("MerchantId", r.getMerchantId()));
        if(r.getMsisdn()!=null) params.add(new BasicNameValuePair("MSISDN", r.getMsisdn()));
        if(r.getProductId()!=null) params.add(new BasicNameValuePair("ProductId", r.getProductId()));

        UrlEncodedFormEntity res = new UrlEncodedFormEntity(params);

        return res;
    }
}
