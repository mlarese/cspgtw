package com.ns.cspgtw.service.builder;

import com.ns.cspgtw.service.enums.ResultCodesEnum;

public interface FactoryResponseBuilder<T>{
    Builder<T> getBuilder() ;
    Builder<T> errorResponseBuilder(ResultCodesEnum resEnum);
}
