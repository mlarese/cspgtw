package com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.service.builder.Request;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException {
        MPayStartWebBillingTransactionRequest r = (MPayStartWebBillingTransactionRequest) getRequest();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        if(r.getCallBackUrl()!=null) params.add(new BasicNameValuePair("CallBackUrl", r.getCallBackUrl()));
        if(r.getCustom()!=null) params.add(new BasicNameValuePair("Custom", r.getCustom()));
        if(r.getMerchantId()!=null) params.add(new BasicNameValuePair("MerchantId", r.getMerchantId()));
        if(r.getMsisdn()!=null) params.add(new BasicNameValuePair("Msisdn", r.getMsisdn()));
        if(r.getPlatFormId()!=null) params.add(new BasicNameValuePair("PlatFormId", r.getPlatFormId()));
        if(r.getProductDescription()!=null) params.add(new BasicNameValuePair("ProductDescription", r.getProductDescription()));
        if(r.getProductId()!=null) params.add(new BasicNameValuePair("ProductId", r.getProductId()));

        UrlEncodedFormEntity res = new UrlEncodedFormEntity(params);

        return res;
    }

    public static void main(String[] args) {
        MPayStartWebBillingTransactionRequest r = new MPayStartWebBillingTransactionRequest();
        r.setMerchantId("merchant");
        r.setProductDescription("setProductDescription");
        r.setProductId("setProductId");
        r.setPlatFormId("setPlatFormId");

        MPayStartWebBillingTransactionDTO swb = new MPayStartWebBillingTransactionDTO(r);

        try {
            System.out.println(
                swb.providePostParams()
            );
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

    }
}
