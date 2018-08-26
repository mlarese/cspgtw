package com.ns.cspgtw.proxylayer.timmobile.mpayretrievemsisdn;
import com.ns.cspgtw.proxylayer.AbstractProxyXmlInvokerDTO;
import com.ns.cspgtw.service.builder.Request;

public class MPayRetrieveMsisdnDTO extends AbstractProxyXmlInvokerDTO {
    public static final String url = "https://merchant.engbms.it/merchantapi/api/1.3/MPayRetrieveMsisdn";


    @Override
    public void reset() {

    }

    public MPayRetrieveMsisdnDTO(Request request) {
        super(MPayRetrieveMsisdnDTO.url, request);
    }

    public MPayRetrieveMsisdnDTO(String url, Request request) {

        super(url, request);


    }

}
