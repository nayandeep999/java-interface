package com.kodewala.interfaces.functional;

public class CalculateTax {

	public static void main(String[] args) {

		CalculateTax ct = new CalculateTax();

		// Lamda avoids the verbose syntax of creating a anonymous class
		// This is not create a additional class file
		// But the current CalculateTax class will be more in size
		// Anonymous class -> creating a anonymous class that implements the IPayTax
		// interface
		// And storing it in a IPayTax reference type
		IPayTax ptx = new IPayTax() {

			public double calculateTax(double a) {
				return (a * TAX) / 100;
			}
		};
		System.out.println(ptx.calculateTax(450000));

		// Under the hood this does the same -> just a syntactical sugar
		IPayTax pt = amount -> (amount * IPayTax.TAX) / 100;
		System.out.println(pt.calculateTax(350000));

	}

}
