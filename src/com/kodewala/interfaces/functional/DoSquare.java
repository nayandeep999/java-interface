package com.kodewala.interfaces.functional;

public class DoSquare {

	public int doSquare(int nums) {
		return nums * nums;
	}

	public static void main(String[] args) {

		// Creating a separate class to override the square method present in the
		// ISquare interface
		ClassSquare sq = new ClassSquare();
		int result = sq.square(100);
		System.out.println(result);

		// LAMDA -> directly overriding the method & storing it in a variable
		ISquare sqre = num -> num * num;
		System.out.println(sqre.square(99));

		// Anonymous class -> not creating class of ISquare interface
		// instead creating class of {}
		ISquare anonymousClass = new ISquare() {

			@Override
			public int square(int num) {
				return num * num;
			}

			// public int multiply(int a, int b) {
			// return a * b;
			// }
			// can't do this b/c this method is present inside the interface
		};

		System.out.println(anonymousClass.square(88));
		// System.out.println(anonymousClass.multiply(2,2));

		// Method reference -> basically calling another method
		DoSquare ds = new DoSquare();

		// ISquare s1 = ds::doSquare(num); // ERROR: Do not use params!
		ISquare s1 = ds::doSquare; // compiler automatically figure out the parameters
		System.out.println(s1.square(55));

		// Not the cleanest way
		ISquare s2 = num -> ds.doSquare(num);
		System.out.println(s2.square(10));

	}

}
