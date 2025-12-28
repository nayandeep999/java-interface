package com.kodewala.interfaces.functional;

@FunctionalInterface
interface ICheckEvenOrOdd {

	boolean checkEven(int num);

}

public class EvenOrOdd {

	public static void main(String[] args) {
		ICheckEvenOrOdd ce = num -> {
			if (num % 2 == 0) {
				return true;
			}

			return false;
		};

		System.out.println(ce.checkEven(7));
		System.out.println(ce.checkEven(100));
	}

}
