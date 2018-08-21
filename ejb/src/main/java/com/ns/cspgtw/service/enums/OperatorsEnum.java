package com.ns.cspgtw.service.enums;

public enum OperatorsEnum {
    WIND(1), TIM(2), VODAFONE(3);
    private Integer operatorId;

    OperatorsEnum(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public Boolean isEqual(String sOperatorId) throws NullPointerException, NumberFormatException {
        int iOperatorId = new Integer(sOperatorId);
        return iOperatorId == this.operatorId;
    }
    public Boolean isEqual(Integer operatorId) throws NullPointerException, NumberFormatException {
        return operatorId == this.operatorId;
    }

    public Integer operatorId() {
        return operatorId;
    }

}
