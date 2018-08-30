package com.ns.cspgtw.helpers;

import com.ns.cspgtw.proxylayer.timmobile.mpaycompletebilling.MPayCompleteBillingTransactionRequest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

public  class JaxbCpUtilities {
    public static String marshall(Object object, String context) throws JAXBException {
        try {
            return marshall(object, Class.forName(context));
        } catch (ClassNotFoundException e) {
            throw new JAXBException(e.getMessage());
        }
    }

    public static String marshall(Object object, Class context) throws JAXBException {
        StringWriter xml = new StringWriter();
        String xmlString = new String();
        JAXBContext jaxbLocalContext = JAXBContext.newInstance(context);
        jaxbLocalContext.createMarshaller().marshal(object, xml);
        return xml.toString();
    }

    public static Object unmarshall(String xmlRequest, String context) throws JAXBException {
        try {
            return unmarshall(xmlRequest, Class.forName(context));
        } catch (ClassNotFoundException e) {
            throw new JAXBException(e.getMessage());
        }
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
        System.out.println("Jaxbl test");
        // ObjectFactory of = new ObjectFactory();
        MPayCompleteBillingTransactionRequest b = new MPayCompleteBillingTransactionRequest();

        b.setStatusCode("99_000");
        b.setTransactionId("22");


        try {
            String s = JaxbCpUtilities.marshall(b,MPayCompleteBillingTransactionRequest.class.getName());

            System.out.println(s);

            MPayCompleteBillingTransactionRequest o = (MPayCompleteBillingTransactionRequest) JaxbCpUtilities.unmarshall(s, MPayCompleteBillingTransactionRequest.class);

            System.out.println(o.getStatusCode());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

}
