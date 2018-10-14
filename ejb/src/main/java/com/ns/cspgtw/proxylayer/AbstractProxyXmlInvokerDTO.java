package com.ns.cspgtw.proxylayer;

import com.ns.cspgtw.helpers.JaxbCpUtilities;
import com.ns.cspgtw.service.builder.Request;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import javax.xml.bind.JAXBException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

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
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException {
        return null;
    }

    @Override
    public String provideUrl() {
        return getUrl();
    }

    @Override
    public String provideXml() {
        try {
            return JaxbCpUtilities.marshall(getRequest());
        } catch (JAXBException e) {
            e.printStackTrace();
            return null;
        }
    }
}
