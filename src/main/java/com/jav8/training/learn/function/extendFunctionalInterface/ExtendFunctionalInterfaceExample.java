package com.jav8.training.learn.function.extendFunctionalInterface;

public class ExtendFunctionalInterfaceExample implements ExtendDoable{  
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	ExtendFunctionalInterfaceExample fie = new ExtendFunctionalInterfaceExample();  
        fie.say("Hello there");  
        fie.doIt();  
    }  
}