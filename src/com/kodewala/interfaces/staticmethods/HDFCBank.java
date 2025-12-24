package com.kodewala.interfaces.staticmethods;

public class HDFCBank implements IBanking {

	@Override
	public void createAcc() {
		System.out.println("HDFCBank.createAcc()");

	}

	// no need to overwrite default method
	// have access to static methods inside IBanking interface
	public void hdfcAccDetails() {
		IBanking.getAccountDetails();
	}

	public static void doSomething() {
		System.out.println("HDFCBank.doSomething()");
	}

}
