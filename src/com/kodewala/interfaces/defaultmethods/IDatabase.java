package com.kodewala.interfaces.defaultmethods;

public interface IDatabase {

	void connect();

	default void sqlQuery() { // default method achieves backward compatibility -> adding new features will
								// not break existing functionality

		System.out.println("IDatabase.sqlQuery()");

	};

}
