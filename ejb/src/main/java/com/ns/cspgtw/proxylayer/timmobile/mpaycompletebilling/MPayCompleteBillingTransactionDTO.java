package com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling.MPayStartWebBillingTransactionRequest;
import com.ns.cspgtw.service.builder.Request;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException {
        MPayCompleteBillingTransactionRequest r = (MPayCompleteBillingTransactionRequest) getRequest();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        if(r.getCustom()!=null) params.add(new BasicNameValuePair("Custom", r.getCustom()));
        if(r.getStatusCode()!=null) params.add(new BasicNameValuePair("StatusCode", r.getStatusCode()));
        if(r.getTransactionId()!=null) params.add(new BasicNameValuePair("Transaction", r.getTransactionId()));


        UrlEncodedFormEntity res = new UrlEncodedFormEntity(params);

        return res;
    }

}
