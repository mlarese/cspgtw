package com.ns.cspgtw.crud;

import com.ns.cspgtw.model.Reporting;

import javax.persistence.EntityManager;

public class ReportingCrud extends Crud<Reporting> {
    public ReportingCrud(EntityManager em) {
        super( Reporting.class,em); }

}
