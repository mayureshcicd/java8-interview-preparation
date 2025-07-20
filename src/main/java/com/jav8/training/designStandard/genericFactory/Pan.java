package com.jav8.training.designStandard.genericFactory;

public class Pan extends AbstractUtil {
    
    public Pan() {
        super.nextClass = Spoon.class;
    }
    
    public String getUse() {
        return "fry";
    }

}
