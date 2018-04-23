package com.child.go.go_child.model;

/**
 * Created by sefu on 4/19/18.
 */

public class Cases {
    private String caseName,caseDescription;

    public Cases() {
    }

    public Cases(String caseName, String caseDescription) {
        this.caseName = caseName;
        this.caseDescription = caseDescription;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getCaseDescription() {
        return caseDescription;
    }

    public void setCaseDescription(String caseDescription) {
        this.caseDescription = caseDescription;
    }
}
