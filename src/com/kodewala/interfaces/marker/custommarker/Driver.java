package com.kodewala.interfaces.marker.custommarker;

class Test1 {

}

class Test2 implements ICustomInterface {

}

class Test3 implements ICustomInterface {

}

public class Driver {

	public static void main(String[] args) {

		CopyFunctionality cf = new CopyFunctionality();

		Test1 t1 = new Test1();
		cf.copy(t1); // Copy not allowed, please implement ICustomInterface

		Test2 t2 = new Test2();
		cf.copy(t2); // Copy functionality allowed

		StupidFunctionality sf = new StupidFunctionality();
		Test3 t3 = new Test3();
		sf.doSomethingStupid(t3);

	}

}
