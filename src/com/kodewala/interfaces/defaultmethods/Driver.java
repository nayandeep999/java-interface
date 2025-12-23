package com.kodewala.interfaces.defaultmethods;

public class Driver implements IDatabase {

	@Override
	public void connect() {
		System.out.println("Driver.connect()");

	}

	@Override
	public void sqlQuery() {

		IDatabase.super.sqlQuery();
		System.out.println("Driver.sqlQuery()");

	}

	public static void main(String[] args) {

		Driver d = new Driver();
		d.sqlQuery();

	}

}
