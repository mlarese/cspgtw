package com.ns.cspgtw.proxylayer;

import java.io.IOException;
import java.net.URISyntaxException;

public interface ProxyInvoker {
    public ProxyInvokeResult invoke(ProxyInvokerDTO dto) throws IOException, URISyntaxException;
    public ProxyInvokeXmlResult invokeXml(ProxyInvokerDTO dto) throws IOException, URISyntaxException;

}
