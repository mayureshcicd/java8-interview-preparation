package com.jav8.training.learn.function.functionalInterface;

@FunctionalInterface  
public interface sayable{  
    void say(String msg);   // abstract method  
    // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  
