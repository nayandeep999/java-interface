package com.kodewala.interfaces.multipleinheritance;

class Banking implements IAccount, ISavingsAccount {
	@Override
	public void getAccountNum() {
		System.out.println("Banking.getAccountNum()");

	}
}

public class Driver {

	public static void main(String[] args) {
		Banking bk = new Banking();
		bk.getAccountNum();

		// default method achieves backward compatibility
	}
}
