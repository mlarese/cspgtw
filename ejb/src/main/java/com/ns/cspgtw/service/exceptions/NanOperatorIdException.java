package com.ns.cspgtw.service.exceptions;

public class NanOperatorIdException extends Exception {
    public NanOperatorIdException() {
        super("Operator id must be a number");
    }

}
