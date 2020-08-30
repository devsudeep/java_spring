package com.sudeep;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaveObjecttoFileSerialization {

	public static void main(String[] args) throws IOException {

//		Person person1 = new Person();
//		person1.setName("Mr. Sudeep Patel");
//		person1.setAge(22);

		File outFile = new File("objects.dat");
		FileOutputStream fileOutStream = new FileOutputStream(outFile);

		ObjectOutputStream outObjectStream = new ObjectOutputStream(fileOutStream);

		Person person;
		for (int i = 0; i < 10; i++) {
			person = new Person("Mr. Espresso" + i, 20 + i);
			outObjectStream.writeObject(person);
		}

		outObjectStream.close();
	}
}
