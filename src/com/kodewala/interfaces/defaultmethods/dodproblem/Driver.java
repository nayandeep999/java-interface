package com.kodewala.interfaces.defaultmethods.dodproblem;

public class Driver implements A, B {

	@Override
	public void doSomething() {
		A.super.doSomething(); // INTERVIEW -> solving the death of diamond problem
		// Calling the implementation we want to call
		B.super.doSomething();
		// If two interfaces have same default method then you must overwrite that
		// method otherwise compiler would throw error
		// Error : Duplicate default methods named doSomething with the parameters ()
		// and () are inherited from the types B and A
	}

	public void doSomethinfElse() {
		B.super.doSomething();
	}

	public static void main(String[] args) {
		Driver d = new Driver();
		d.doSomething();
		d.doSomethinfElse();

		System.out.println("----------------------------");

		A a = new Driver();
		a.doSomething();

		B b = new Driver();
		b.doSomething(); // Method calls happens based on the object type

	}
}
