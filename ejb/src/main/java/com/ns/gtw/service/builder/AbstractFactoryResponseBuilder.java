package com.ns.gtw.service.builder;

public abstract class AbstractFactoryResponseBuilder<T,R> implements FactoryResponseBuilder<T> {
    private R request;
    private Resources resources;

    public AbstractFactoryResponseBuilder(Resources resources, Request request) {
        this.request = (R)request;
        this.resources=resources;
    }

    public R getRequest() {
        return request;
    }

    public void setRequest(R request) {
        this.request = request;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }
}
