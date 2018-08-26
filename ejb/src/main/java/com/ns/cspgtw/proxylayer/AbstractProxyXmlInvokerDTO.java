package com.ns.cspgtw.proxylayer;

import com.ns.cspgtw.service.builder.Request;

public abstract class AbstractProxyXmlInvokerDTO implements ProxyXmlProvider, ProxyInvokerDTO {
    private Request request;

    public abstract void reset();
    private String url = "";

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    public AbstractProxyXmlInvokerDTO(String url, Request request) {
        setUrl(url);
        setRequest(request);

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
