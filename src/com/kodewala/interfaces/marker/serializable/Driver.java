package com.kodewala.interfaces.marker.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Driver {

	public static void main(String[] args) {
		Account acc = new Account("Nayandeep", "001", "Axis");

		try {
			FileOutputStream fl = new FileOutputStream("acc.ser");
			ObjectOutputStream os = new ObjectOutputStream(fl);
			os.writeObject(acc);

			FileInputStream fis = new FileInputStream("acc.ser");
			ObjectInput ois = new ObjectInputStream(fis);
			Account accSer = (Account) ois.readObject();
			System.out.println(accSer.accNum + " " + acc.bankName + " " + acc.name);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
