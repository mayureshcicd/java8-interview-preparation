package com.jav8.training.learn.streamException;

@FunctionalInterface
public interface CheckException<Target, exObj extends Exception> {

	public void accept(Target target) throws exObj;
}
