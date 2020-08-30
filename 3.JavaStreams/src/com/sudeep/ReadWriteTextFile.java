package com.sudeep;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File inFile  = new File("sampleascii.txt");
		FileOutputStream outFileStream = new FileOutputStream(inFile);
		PrintWriter outStream = new PrintWriter(outFileStream);
		//read values back from the stream and display them
		outStream.println(987654321);
		outStream.println(11111111L);
		outStream.println(22222222F);
		outStream.println(3333333D);
		outStream.println("sudeep,patel,38");
		outStream.println(true);
		outStream.close();
		
//		read back
		FileReader fileReader = new FileReader(inFile);
		BufferedReader bufferReader =  new BufferedReader(fileReader);

		while(true) {
			String str = bufferReader.readLine();
			if(str == null)	break;
			
			System.out.println(str);
		}
		
 		
//		int intValue = Integer.parseInt(str);
//		System.out.println(intValue);
		bufferReader.close();
		
		
		Scanner scanner = new Scanner(new File("sampleascii.txt"));
		int i = scanner.nextInt();
		System.out.println(i);
		scanner.close();
			
	}

}
