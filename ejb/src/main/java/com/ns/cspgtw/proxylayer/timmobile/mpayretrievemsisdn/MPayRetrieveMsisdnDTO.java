package com.ns.cspgtw.proxylayer.timmobile.mpayretrievemsisdn;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.proxylayer.timmobile.mpaystartwebbilling.MPayStartWebBillingTransactionRequest;
import com.ns.cspgtw.service.builder.Request;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class MPayRetrieveMsisdnDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayRetrieveMsisdn";


    @Override
    public void reset() {

    }

    public MPayRetrieveMsisdnDTO(Request request) {
        super(MPayRetrieveMsisdnDTO.url, request);
    }

    public MPayRetrieveMsisdnDTO(String url, Request request) {

        super(url, request);

    }
    @Override
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException {
        MPayRetrieveMsisdnRequest r = (MPayRetrieveMsisdnRequest) getRequest();
        List<NameValuePair> params = new ArrayList<NameValuePair>();

        if(r.getCustom()!=null) params.add(new BasicNameValuePair("Custom", r.getCustom()));
        if(r.getTransactionId()!=null) params.add(new BasicNameValuePair("TransactionId", r.getTransactionId()));

        UrlEncodedFormEntity res = new UrlEncodedFormEntity(params);

        return res;
    }

}
