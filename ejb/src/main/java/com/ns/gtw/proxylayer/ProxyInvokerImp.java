package com.ns.gtw.proxylayer;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ProxyInvokerImp implements ProxyInvoker {

    public ProxyInvokeResult invoke (ProxyInvokerDTO dto) throws IOException, URISyntaxException {
        HttpClient cli = HttpClients.createDefault();
        URI uri = new URIBuilder().build();
        HttpGet get = new HttpGet(dto.provideUrl());
        HttpResponse res = cli.execute(get);

        return  new ProxyInvokeResult(
           EntityUtils.toString( res.getEntity())
        ) ;
    }

}
