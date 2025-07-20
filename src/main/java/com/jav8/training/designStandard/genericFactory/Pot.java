package com.jav8.training.designStandard.genericFactory;

public class Pot extends AbstractUtil {
    
    public Pot() {
        super.nextClass = Pan.class;
    }
    
    public String getUse() {
        return "boil";
    }
}
