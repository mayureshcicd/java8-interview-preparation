package com.jav8.training.learn.function;

public interface FunctionInterface<T,R> {

    public <R> Long apply(T parameter);
}
