package com.kodewala.interfaces.functional;

public class ConvertUppercase {

	public static void main(String[] args) {

		IUppercase uc = (str) -> str.toUpperCase();

		String str1 = uc.convertToUppercase("hello");

		System.out.println(str1);

	}

}
