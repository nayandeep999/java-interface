package com.kodewala.interfaces.marker.serializable;

import java.io.Serializable;

public class Account implements Serializable {

	String name;
	String accNum;
	String bankName;

	public Account(String name, String accNum, String bankName) {
		super();
		this.name = name;
		this.accNum = accNum;
		this.bankName = bankName;
	}

}
