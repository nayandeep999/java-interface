package com.kodewala.interfaces.defaultmethods;

public class MySQL implements IDatabase {

	@Override
	public void connect() {
		System.out.println("MySQL.connect()");

	}

}
