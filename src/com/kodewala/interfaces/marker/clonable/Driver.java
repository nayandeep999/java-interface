package com.kodewala.interfaces.marker.clonable;

public class Driver {

	public static void main(String[] args) {

		CopyObjectsClonable coc1 = new CopyObjectsClonable("hello", "001");
		CopyObjectsClonable coc2 = null;
		try {
			coc2 = (CopyObjectsClonable) coc1.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		coc2.objDetails();
	}

}
