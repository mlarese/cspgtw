package com.ns.cspgtw.service.builder;

public abstract class AbstractBuilder<T,R> implements Builder<T>{
    private Resources resources;
    private  R request;

    public AbstractBuilder(Resources resources, Request request) {
        this.resources = resources;
        this.request = (R)request;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public R getRequest() {
        return request;
    }

    public void setRequest(R request) {
        this.request = request;
    }
}
