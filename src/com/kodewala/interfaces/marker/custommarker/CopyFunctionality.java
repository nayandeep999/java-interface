package com.kodewala.interfaces.marker.custommarker;

public class CopyFunctionality {

	public void copy(Object obj) {

		if (obj instanceof ICustomInterface) {
			System.out.println("Copy functionality allowed");
		} else {
			System.out.println("Copy not allowed, please implement ICustomInterface");
		}

	}

}
