package com.kodewala.interfaces.functional;

public class AddNum {

	public static void main(String[] args) {
		IAddNum anum = (a, b) -> a + b; // Lamda & Functional Interface -> Java 8
		int res = anum.addNum(10, 12);
		System.out.println(res);

		IAddNum addnum = (a, b) -> {
			int c = a + b;
			return c;
		};

		System.out.println(addnum.addNum(100, 200));
	}

}
