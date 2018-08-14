package com.ns.gtw.proxylayer;

public class ProxyInvokeResult {
    private Integer result;

    public Integer getResult() {
        return result;
    }

    public ProxyInvokeResult(String result) {
        try {
            this.result = new Integer(result.trim());
        } catch (Exception e) {
            System.out.println(e);
            this.result =99;
        }
    }

    public boolean hasError() {
        return (result == 0);
    }
}
