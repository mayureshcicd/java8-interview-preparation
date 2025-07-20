package com.jav8.training.designStandard.genericFactory;


public abstract class AbstractUtil implements FactoryElement {

    protected Class nextClass = null;

    @Override
    public Class getNextElement() {
        return nextClass;
    }

    public String getUse(String value) {
        return value.toLowerCase();
    }

}
