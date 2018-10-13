package com.ns.cspgtw.proxylayer;

import com.ns.cspgtw.http.HttpInvoker;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class ProxyInvokerImp implements ProxyInvoker {

    public ProxyInvokeResult invoke (ProxyInvokerDTO dto) throws IOException, URISyntaxException {
        String res = HttpInvoker.doGet(dto.provideUrl());
        return  new ProxyInvokeResult(res);
    }

    public ProxyInvokeXmlResult invokeXml (ProxyInvokerDTO dto) throws IOException, URISyntaxException {
        String xml = dto.provideXml();
        HttpClient cli = HttpClients.createDefault();
        URI uri = new URIBuilder().build();
        HttpPost post = new HttpPost(dto.provideUrl());

        StringEntity postEntity = new StringEntity(xml);
        post.setEntity(postEntity);

        HttpResponse res = cli.execute(post);


        return  new ProxyInvokeXmlResult(
                ""
        ) ;
    }

}
