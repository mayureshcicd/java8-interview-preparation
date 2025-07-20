package com.jav8.training.learn.javaBeansPropertyDescriptor;

public class TestRequest {

    public static void main(String[] args) {

        Person person=new Person("mayuresh",null);

        System.out.println(ContactInfoAttribute.readAttributeValue(Person.class,ContactInfoAttribute.getEnum("empCode"),person," not allowed " ) );
        System.out.println(ContactInfoAttribute.readAttributeValue(Person.class,ContactInfoAttribute.getEnum("email") ,person ," not allowed ") );

    }


}
