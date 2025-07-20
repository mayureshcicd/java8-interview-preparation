package com.jav8.training.learn.mapFlatMapDifference;

import java.util.ArrayList;
import java.util.List;

public class Developer {
    int id;
    String name;

    List<String> address;

    public Developer(int id, String name, List<String> address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }



    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}
