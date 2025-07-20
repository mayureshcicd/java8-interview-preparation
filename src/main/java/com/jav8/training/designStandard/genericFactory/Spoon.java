package com.jav8.training.designStandard.genericFactory;

public class Spoon extends AbstractUtil {
    
    public Spoon() {
        super.nextClass = null;
    }
    
    public String getUse() {
        return "stir";
    }

}