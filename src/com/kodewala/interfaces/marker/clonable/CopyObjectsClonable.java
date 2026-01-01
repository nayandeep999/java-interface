package com.kodewala.interfaces.marker.clonable;

public class CopyObjectsClonable implements Cloneable { // giving permission to clone
	// Marker interface gives permission
	private String name;
	private String id;

	public CopyObjectsClonable(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public void objDetails() {
		System.out.println(name + " " + id);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}
