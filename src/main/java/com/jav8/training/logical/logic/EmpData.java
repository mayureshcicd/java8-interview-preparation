package com.jav8.training.logical.logic;

import java.util.Optional;

public class EmpData {
    int id;
    Optional<String> name;
    Optional<Integer> code;

    public EmpData(int id, Optional<String> name) {
        this.id = id;
        this.name = name;
    }

    public EmpData(int id, Optional<String> name, Optional<Integer> code) {
        this.id = id;
        this.name = name;
        this.code = code;
    }

    public EmpData(int id) {
        this.id = id;
    }

    public EmpData() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public Optional<Integer> getCode() {
        return code;
    }

    public void setCode(Optional<Integer> code) {
        this.code = code;
    }
}
