package com.ns.gtw.service.builder;

public class SimpleBuilder implements Builder{
    private Response response;

    public SimpleBuilder(Response response) {
        this.response = response;
    }

    @Override
    public Response build() {
        return response;
    }
}
