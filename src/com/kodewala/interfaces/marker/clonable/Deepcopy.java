package com.kodewala.interfaces.marker.clonable;

import java.util.Arrays;

class Address implements Cloneable {
	String city;
	int zip;

	public Address(String city, int zip) {
		super();
		this.city = city;
		this.zip = zip;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

public class Deepcopy implements Cloneable {

	String name;
	int age;
	int arr[];
	Address add;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Deepcopy dc = (Deepcopy) super.clone();
		dc.arr = this.arr.clone(); // Creates a brand-new array, Copies all elements into it
		dc.add = (Address) this.add.clone();
		return dc;
	}

	public Deepcopy(String name, int age, Address add, int... i) {
		this.name = name;
		this.age = age;
		this.arr = i;
		this.add = add;
	}

	public void getDetails() {
		System.out.printf("Name: %s, Age: %d, Arr: %s%n", this.name, this.age, Arrays.toString(this.arr));
		System.out.println("City: " + add.city + " | Zip: " + add.zip + "\n");
	}

	public static void main(String[] args) {
		Address add = new Address("Banglore", 9);
		Deepcopy sc1 = new Deepcopy("Nayandeep", 26, add, 10, 20, 30);
		System.out.println("sc1: ");
		sc1.getDetails();
		Deepcopy sc2 = null;

		try {
			sc2 = (Deepcopy) sc1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("sc2: ");
		sc2.getDetails();

		System.out.println("-----------Changing details of sc1-----------");
		sc1.age = 28;
		sc1.name = "Seema"; // This creates a new string & sc1.name points to that string
		sc1.arr[0] = 90; // changing this not results in change in sc2
		sc1.add.city = "Delhi";
		sc1.add.zip = 10;

		System.out.println("sc1: ");
		sc1.getDetails();

		System.out.println("sc2: "); // sc2.name still points to the same string
		sc2.getDetails();

	}

}
