package com.jav8.training.logical.sorting;

import java.time.LocalDateTime;


public class Item {
    public Integer histCounter;
    public int empCode;
    public String relCounter;
    public String relCode;
    public String familyName;
    public String firstName;
    public LocalDateTime enteredDate;
    public String enteredByName;
    public String nok;

    public Item(int histCounter, int empCode, String relCode,String relCounter, String firstName, LocalDateTime enteredDate) {
        this.histCounter = histCounter;
        this.empCode = empCode;
        this.relCode = relCode;
        this.relCounter=relCounter;
        this.firstName = firstName;
        this.enteredDate = enteredDate;
    }
    public Item(Integer histCounter, int empCode, String relCode,String relCounter, String firstName, LocalDateTime enteredDate, String nok) {
        this.histCounter = histCounter;
        this.empCode = empCode;
        this.relCode = relCode;
        this.relCounter=relCounter;
        this.firstName = firstName;
        this.enteredDate = enteredDate;
        this.nok=nok;
    }
    public Integer getHistCounter() {
        return histCounter;
    }

    public void setHistCounter(Integer histCounter) {
        this.histCounter = histCounter;
    }

    public int getEmpCode() {
        return empCode;
    }

    public void setEmpCode(int empCode) {
        this.empCode = empCode;
    }

    public String getRelCounter() {
        return relCounter;
    }

    public void setRelCounter(String relCounter) {
        this.relCounter = relCounter;
    }

    public String getRelCode() {
        return relCode;
    }

    public void setRelCode(String relCode) {
        this.relCode = relCode;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDateTime getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(LocalDateTime enteredDate) {
        this.enteredDate = enteredDate;
    }

    public String getEnteredByName() {
        return enteredByName;
    }

    public void setEnteredByName(String enteredByName) {
        this.enteredByName = enteredByName;
    }

    public String getNok() {
        return nok;
    }

    @Override
    public String toString() {
        return "Item{" +
                "histCounter=" + histCounter +
                ", empCode=" + empCode +
                ", relCounter='" + relCounter + '\'' +
                ", relCode='" + relCode + '\'' +
                ", familyName='" + familyName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", enteredDate=" + enteredDate +
                ", enteredByName='" + enteredByName + '\'' +
                ", nok='" + nok + '\'' +
                '}';
    }
}
