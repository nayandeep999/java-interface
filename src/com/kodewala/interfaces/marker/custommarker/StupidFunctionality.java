package com.kodewala.interfaces.marker.custommarker;

public class StupidFunctionality {

	public void doSomethingStupid(Object obj) {

		if (obj instanceof ICustomInterface) {
			System.out.println("Stupid functionality allowed");
		} else {
			System.out.println("Stupid functionality not allowed, please implement ICustomInterface");
		}
	}

}
