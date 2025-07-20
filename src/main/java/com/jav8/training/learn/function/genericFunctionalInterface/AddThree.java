package com.jav8.training.learn.function.genericFunctionalInterface;


import com.jav8.training.learn.function.FunctionInterface;

public class AddThree implements FunctionInterface<Long, Long> {

    @Override
    public Long apply(Long aLong) {
        return aLong + 3;
    }
}

