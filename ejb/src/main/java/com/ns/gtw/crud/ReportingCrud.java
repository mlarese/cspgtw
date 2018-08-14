package com.ns.gtw.crud;

import com.ns.gtw.model.Reporting;

import javax.persistence.EntityManager;

public class ReportingCrud extends Crud<Reporting> {
    public ReportingCrud(EntityManager em) {
        super( Reporting.class,em); }

}
