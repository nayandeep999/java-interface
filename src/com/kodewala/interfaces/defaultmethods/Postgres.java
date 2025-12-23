package com.kodewala.interfaces.defaultmethods;

public class Postgres implements IDatabase {

	@Override
	public void connect() {
		System.out.println("Postgres.connect()");

	}

}
