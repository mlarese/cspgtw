package com.ns.cspgtw.proxylayer;

import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.message.BasicNameValuePair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class AbstractProxyInvokerDTO extends HashMap<String, String> implements ProxyUrlProvider, ProxyInvokerDTO {
    public abstract void reset();
    private String url = "";

    public AbstractProxyInvokerDTO() {
        super();
        reset();
    }

    public AbstractProxyInvokerDTO(String url) {
        super();
        setUrl(url);

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String provideXml() {
       // not used
        return null;
    }

    public  String provideUrl () {
        List<NameValuePair> queryParams = new ArrayList<NameValuePair>();
        for (Entry<String, String> entry : this.entrySet()) {
            queryParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }

        URIBuilder b= new URIBuilder();
        b   .setPath(getUrl())
            .setParameters(queryParams) ;

        return b.toString();

    }
}
