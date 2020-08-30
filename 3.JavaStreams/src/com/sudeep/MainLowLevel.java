package com.sudeep;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainLowLevel {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub

//		JFileChooser chooser = new JFileChooser( );
//		int status = chooser.showOpenDialog(null);
//		System.out.println(status);

		File outFile = new File("sample.out");

		FileOutputStream outStream = new FileOutputStream(outFile);

		byte[] byteArray = { 10, 20, 30 };

		outStream.write(byteArray);
		outStream.write(100);
		outStream.close();

		File inFile = new File("sample.out");

		FileInputStream inStream = new FileInputStream(inFile);
		byte[] readByte = new byte[(int) inFile.length()];

		inStream.read(readByte);
		System.out.println(readByte);
		System.out.println(inStream.read());
		System.out.println(inStream.read());
		System.out.println(inFile.length());

		inStream.read(readByte);
		System.out.println(readByte);
		inStream.read(readByte);

		System.out.println(inStream.read(readByte));

		inStream.close();

		byte[] byteArrayN = { (byte) 'J', (byte) 'a', (byte) 'v', (byte) 'a' };
		FileOutputStream outStream1 = new FileOutputStream(outFile);

		outStream1.write(byteArrayN);
	
		outStream1.close();
	}

}
