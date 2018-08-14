package com.ns.gtw.service.builder;

import com.ns.gtw.service.enums.ResultCodesEnum;

public interface FactoryResponseBuilder<T>{
    Builder<T> getBuilder() ;
    Builder<T> errorResponseBuilder(ResultCodesEnum resEnum);
}
