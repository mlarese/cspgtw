package com.ns.cspgtw.http;

import com.ns.cspgtw.proxylayer.ProxyInvokeResult;
import com.ns.cspgtw.proxylayer.ProxyInvokeXmlResult;
import com.ns.cspgtw.proxylayer.ProxyInvokerDTO;
import org.apache.cxf.configuration.jsse.SSLUtils;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.apache.http.util.EntityUtils;

import javax.net.ssl.SSLContext;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

public class HttpInvoker {
    public static String doPost (String xml, String url) throws IOException, URISyntaxException {
        HttpClient cli = HttpClients.createDefault();
        URI uri = new URIBuilder().build();
        HttpPost post = new HttpPost(url);


        post.setHeader("Accept", "application/xml");
        post.setHeader("Cache-Control", "no-cache");
        post.setHeader("Pragma", "no-cache");
        post.setHeader("Content-Type", "text/xml; charset=utf-8");

        post.setEntity(new StringEntity(xml,"UTF-8"));


        HttpResponse res = cli.execute(post);

        return EntityUtils.toString(res.getEntity(), Charset.forName("UTF-8"));
    }

    public static String doGet(String url) throws IOException, URISyntaxException {
        HttpClient cli = HttpClients.createDefault();
        URI uri = new URIBuilder().build();
        HttpGet get = new HttpGet(url);
        HttpResponse res = cli.execute(get);
        return EntityUtils.toString( res.getEntity()) ;
    }
}
