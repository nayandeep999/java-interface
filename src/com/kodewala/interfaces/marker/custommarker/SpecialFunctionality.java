package com.kodewala.interfaces.marker.custommarker;

interface IAllowSpecialFunctionality {

}

class CustomClass implements IAllowSpecialFunctionality {

	public void m2() {
		SpecialFunctionality sf = new SpecialFunctionality();
		sf.m1(this);
	}

}

class CustomClassV2 {
	public void m2() {
		SpecialFunctionality sf = new SpecialFunctionality();
		sf.m1(this);
	}
}

public class SpecialFunctionality {

	public void m1(Object obj) {
		if (obj instanceof IAllowSpecialFunctionality) {
			System.out.println("Special functionality allowed");
		} else {
			System.out.println("Not allowed");
		}
	}

	public static void main(String[] args) {
		CustomClass cc = new CustomClass();
		cc.m2(); // Special functionality allowed

		CustomClassV2 ccv2 = new CustomClassV2();
		ccv2.m2(); // Not allowed
	}

}
