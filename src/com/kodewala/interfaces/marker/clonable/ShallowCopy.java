package com.kodewala.interfaces.marker.clonable;

import java.util.Arrays;

public class ShallowCopy implements Cloneable {

	String name;
	int age;
	int arr[];

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public ShallowCopy(String name, int age, int... i) {
		this.name = name;
		this.age = age;
		this.arr = i;
	}

	public void getDetails() {
		System.out.printf("Name: %s, Age: %d, Arr: %s%n%n", this.name, this.age, Arrays.toString(this.arr));
	}

	public static void main(String[] args) {

		ShallowCopy sc1 = new ShallowCopy("Nayandeep", 26, 10, 20, 30);
		System.out.println("sc1: ");
		sc1.getDetails();
		ShallowCopy sc2 = null;

		try {
			sc2 = (ShallowCopy) sc1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("sc2: ");
		sc2.getDetails();

		System.out.println("-----------Changing details of sc1-----------");
		sc1.age = 28;
		sc1.name = "Nayan"; // This creates a new string & sc1.name points to that string
		sc1.arr[0] = 90; // changing this results in identical change in both sc1 & sc2

		System.out.println("sc1: ");
		sc1.getDetails();

		System.out.println("sc2: "); // sc2.name still points to the same string
		sc2.getDetails();

	}

}
