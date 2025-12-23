package com.kodewala.interfaces.multipleinheritance;

public interface IAccount {

	void getAccountNum();

	public default void checkBalance() {

		// default method achieves backward compatibility

	};

}
