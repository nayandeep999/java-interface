package com.kodewala.interfaces.defaultmethods.dodproblem;

public interface B {

	default void doSomething() {
		System.out.println("B.doSomething()");
	}

}
