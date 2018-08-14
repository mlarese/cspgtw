package com.ns.gtw.service.enums;

public enum ResultCodesEnum {
    RC1001(1001,"Success. Customer billed."),
    RC1000(1000,"Success. Operation was taken over."),
    RC1002(1002,"Success. Billing asynch pending."),
    RC1003(1003,"Success. Operation was taken over."),
    RC2020(2020,"Parameter Syntax Error."),
    RC2000(2000,"Internal System Error."),
    RC2040(2040,"Carrier Error Generic."),
    RC2070(2070,"Request number exceed max allowed."),
    RC2050(2050,"Carrier Network Error."),
    RC2060(2060,"Carrier Timeout."),
    RC3000(3000,"Authorization Error."),
    RC3010(3010,"MSISDN malformed."),
    RC3020(3020,"MSISDN forbidden."),
    RC3050(3050,"BillingID not correct."),
    RC3100(3100,"Transaction ended in error due to general causes."),
    RC3200(3200,"Transaction ended by error due to limitation of service."),
    RC3201(3201,"User in black list or suspended."),
    RC3904(3904,"Renewal attempt after 8 weeks."),
    RC4000(4000,"Customer not enough credit."),
    RC4050(4050,"Payment limit reached in subscription period."),
    RC4070(4070,"User already deactivated / Not registered."),
    RC4070_1(4070,"User already deactivated / Not registered."),
    RC4095(4095,"Amount fuori dal range consentito."),
    RC4096(4096,"Prezzo non ammesso."),
    RC4097(4097,"Frazionamento in corso."),
    RC4080(4080,"User already Activated."),

    ;
    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    ResultCodesEnum(int code, String description) {
        this.code = code;
        this.description = description;
    }
}