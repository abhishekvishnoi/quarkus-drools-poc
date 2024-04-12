package com.edw.model;

/**
 * <pre>
 *     com.edw.model.Loan
 * </pre>
 *
 */
public class Loan {

    private Integer age;
    private Double salary;

    private String risk;

    public Loan() {
    }

    public Loan(Integer age, Double salary, String risk) {
        this.age = age;
        this.salary = salary;
        this.risk = risk;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getRisk() {
        return risk;
    }

    public void setRisk(String risk) {
        this.risk = risk;
    }
}
