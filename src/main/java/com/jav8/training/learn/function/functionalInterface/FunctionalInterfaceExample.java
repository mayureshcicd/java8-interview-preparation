package com.jav8.training.learn.function.functionalInterface;

public class FunctionalInterfaceExample implements sayable {
    public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
        FunctionalInterfaceExample fie = new FunctionalInterfaceExample();  
        fie.say("Hello there");
        System.out.println(fie.toString());
    }  
}  