package com.kodewala.interfaces.staticmethods;

public class Driver {

	public static void main(String[] args) {
		HDFCBank hdfc = new HDFCBank();
		hdfc.createAcc();
		hdfc.checkLimits(); // not overridden
		hdfc.hdfcAccDetails(); // static method in IBanking interface

		System.out.println("-------------------------------");

		AxisBank ax = new AxisBank();
		ax.checkLimits();
		ax.checkLimits();
		ax.axisBankDetails(); // static method in IBanking interface

		System.out.println("-------------------------------");

		HDFCBank hdfx = new AxisBank();
		hdfx.doSomething(); // we can call static method through parent reference in class

		// but we can only call static method in interface with Interface.doSomething()
	}

}
