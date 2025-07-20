package com.jav8.training.learn.javaBeansPropertyDescriptor;

import java.beans.PropertyDescriptor;

public enum ContactInfoAttribute {

    empCode("empCode","seaferCode"),
    email("email","address");
    ContactInfoAttribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    private String key;
    private String value;

    public static String getEnumValue(String value) {
        for (ContactInfoAttribute v : values())
            if (v.getKey().equalsIgnoreCase(value)) return v.getValue();
        throw new IllegalArgumentException();
    }
    public static ContactInfoAttribute getEnum(String value) {
        for (ContactInfoAttribute v : values())
            if (v.getKey().equalsIgnoreCase(value)) return v;
        throw new IllegalArgumentException();
    }
    public String getKey() {
        return key;
    }

    public String getValue() {
        return this.value;
    }
    public static  Object  readAttributeValue(  Class  responseClass, ContactInfoAttribute requestType ,Object person, String oracleMessage )  {
        try
        {
            Object object=new PropertyDescriptor(requestType.getValue(), responseClass).getReadMethod().invoke(person);
            return  requestType.getValue().concat(" value  getting ").concat(String.valueOf(object)).concat(oracleMessage); //bind oracle message
        }
        catch (Exception e)
        {
            return null;
        }

    }
}