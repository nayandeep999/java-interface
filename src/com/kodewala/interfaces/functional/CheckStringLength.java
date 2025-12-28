package com.kodewala.interfaces.functional;

@FunctionalInterface
interface ICheckStringLength {
	int checkStrLen(String str);
}

public class CheckStringLength {

	public static void main(String[] args) {
		ICheckStringLength cstrlen = str -> str.length();

		System.out.println(cstrlen.checkStrLen("hello"));
	}

}
