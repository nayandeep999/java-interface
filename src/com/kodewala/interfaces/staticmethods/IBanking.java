package com.kodewala.interfaces.staticmethods;

public interface IBanking {

	public abstract void createAcc();

	public default void checkLimits() {
		System.out.println("IBanking.checkLimits()");
	}

	private static void connectToDb() { // Private Method -> Introduced to reduce code duplication inside INTERFACE
										// (default & static methods can use same private methods) -> JAVA 1.9

		System.out.println("IBanking.connectToDb()");
	}

	public static void getAccountDetails() { // Static Method -> Introduced in JAVA 1.8 to reduce code duplication in
												// the classes that implements that interface
		connectToDb();
		System.out.println("IBanking.getAccountDetails()");
	}

	// JAVA 1.8 -> default & static methods , JAVA 1.9 -> private methods
}
