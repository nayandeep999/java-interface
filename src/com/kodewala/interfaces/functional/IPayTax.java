package com.kodewala.interfaces.functional;

@FunctionalInterface
public interface IPayTax {

	public static final double TAX = 30.00;

	public abstract double calculateTax(double income);
}
