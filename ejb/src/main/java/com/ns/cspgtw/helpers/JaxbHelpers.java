package com.ns.cspgtw.helpers;

import com.ns.cspgtw.proxylayer.ObjectFactory;
import com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling.MPayCompleteBillingTransactionRequest;
import com.ns.cspgtw.service.api.billing.BillingRequest;
import com.ns.cspgtw.service.api.mpaycompletebilling.MPayCompleteBillingRequest;
import com.ns.cspgtw.service.api.mpaycompletebilling.MPayCompleteBillingResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public  class JaxbHelpers {
    public static String marshall(Object object, String context) throws JAXBException {
        StringWriter xml = new StringWriter();
        String xmlString = new String();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(context);
        jaxbLocalContext.createMarshaller().marshal(object, xml);
        return xml.toString();
    }

    public static Object unmarshall(String xmlRequest, String context) throws JAXBException {
        Unmarshaller unmarshaller=null;
        Object objectJAXB=null;

        JAXBContext jaxbContext = JAXBContext.newInstance (context);
        unmarshaller = jaxbContext.createUnmarshaller();
        StringBuffer xmlString = new StringBuffer(xmlRequest);
        objectJAXB = unmarshaller.unmarshal(new StringReader(xmlString.toString()));

        return objectJAXB;

    }


    public static void main(String[] args) {
        System.out.println("Jaxbl test");
        ObjectFactory of = new ObjectFactory();
        MPayCompleteBillingTransactionRequest b = of.createMPayCompleteBillingTransactionRequest();

        b.setStatusCode("100");
        b.setTransactionId("22");


        try {
            String s = JaxbHelpers.marshall(b,MPayCompleteBillingTransactionRequest.class.getName());

            System.out.println(s);
        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
