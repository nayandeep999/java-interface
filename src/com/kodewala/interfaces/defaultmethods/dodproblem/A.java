package com.kodewala.interfaces.defaultmethods.dodproblem;

public interface A {

	default void doSomething() {
		System.out.println("A.doSomething()");
	}

}
