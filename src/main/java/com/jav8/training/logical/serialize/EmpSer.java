package com.jav8.training.logical.serialize;
import java.io.Serializable;
public class EmpSer implements Serializable{
    int id;
    String name;

    transient int age;//Now it will not be serialized
    public EmpSer(int id, String name,int age) {
        this.id = id;
        this.name = name;
        this.age=age;
    }

}