package com.ns.cspgtw.proxylayer;

import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.io.UnsupportedEncodingException;

public interface ProxyXmlProvider {
    public String provideXml() ;
    public UrlEncodedFormEntity providePostParams() throws UnsupportedEncodingException;
}
