package com.ns.cspgtw.helpers;

import com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling.MPayCompleteBillingTransactionRequest;
import com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling.MPayCompleteBillingTransactionResponse;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public  class JaxbCpUtilities {

    public static String marshall(Object object) throws JAXBException {
        StringWriter xml = new StringWriter();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(object.getClass());
        jaxbLocalContext.createMarshaller().marshal(object, xml);
        return xml.toString();
    }


    public static Object unmarshall(String xmlRequest, Class context) throws JAXBException {
        Unmarshaller unmarshaller=null;
        Object objectJAXB=null;

        JAXBContext jaxbContext = JAXBContext.newInstance (context);
        unmarshaller = jaxbContext.createUnmarshaller();
        StringBuffer xmlString = new StringBuffer(xmlRequest);
        objectJAXB = unmarshaller.unmarshal(new StringReader(xmlString.toString()));

        return objectJAXB;

    }


    public static void main(String[] args) {
        MPayCompleteBillingTransactionRequest o1 = new MPayCompleteBillingTransactionRequest(); o1.setStatusCode("99_000"); o1.setTransactionId("22");
        MPayCompleteBillingTransactionResponse o2 = new MPayCompleteBillingTransactionResponse(); o2.setCustom("custom"); o2.setMsisdn("msisdn");

        try {
            String s;
            s = JaxbCpUtilities.marshall(o1); System.out.println(s);
            s = JaxbCpUtilities.marshall(o2); System.out.println(s);



        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
