package com.edw.model;

/**
 * <pre>
 *     com.edw.model.Loan
 * </pre>
 *
 */
public class Gst {

    private Integer stateTax;

    private Integer centralTax;

    private String state;

    private boolean isStateExempt;

    public Gst() {}

    public Gst(Integer stateTax, Integer centralTax, String state, boolean isStateExempt) {
        this.stateTax = stateTax;
        this.centralTax = centralTax;
        this.state = state;
        this.isStateExempt = isStateExempt;
    }

    public Integer getStateTax() {
        return stateTax;
    }

    public void setStateTax(Integer stateTax) {
        this.stateTax = stateTax;
    }

    public Integer getCentralTax() {
        return centralTax;
    }

    public void setCentralTax(Integer centralTax) {
        this.centralTax = centralTax;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public boolean isStateExempt() {
        return isStateExempt;
    }

    public void setStateExempt(boolean stateExempt) {
        isStateExempt = stateExempt;
    }
}

