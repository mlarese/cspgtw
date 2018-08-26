package com.ns.cspgtw.proxylayer;

public class ProxyInvokeXmlResult {
    private String result;

    public String getResult() {
        return result;
    }

    public ProxyInvokeXmlResult(String result) {
        try {
            this.result = result;
        } catch (Exception e) {
            System.out.println(e);
            this.result = null;
        }
    }

    public boolean hasError() {
        return (result == null);
    }
}
