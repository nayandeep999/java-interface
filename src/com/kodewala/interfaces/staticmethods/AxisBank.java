package com.kodewala.interfaces.staticmethods;

public class AxisBank extends HDFCBank implements IBanking {

	@Override
	public void createAcc() {
		System.out.println("AxisBank.createAcc()");

	}

	// Overriding default method
	@Override
	public void checkLimits() {
		System.out.println("AxisBank.checkLimits()");
	}

	public void axisBankDetails() {
		IBanking.getAccountDetails();
	}

}
