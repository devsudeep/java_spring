package com.sudeep;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ManHighLevelFileIO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File outFile = new File("sample.out");
		FileOutputStream outStream = new FileOutputStream("sample3.out");
		
		DataOutputStream outDataStream = new DataOutputStream(outStream);
		outDataStream.writeInt(987654321);
		outDataStream.writeLong(11111111L);
		outDataStream.writeFloat(22222222F);
		outDataStream.writeDouble(3333333D);
		outDataStream.writeChar('A');
		outDataStream.writeBoolean(true);
		outDataStream.close();
		
		// read back the 
		File inFile = new File("sample3.out");
		FileInputStream inStream = new FileInputStream(inFile);
		DataInputStream inDataStream = new DataInputStream(inStream);
		
		//read values back from the stream and display them
		System.out.println(inDataStream.readInt());
		System.out.println(inDataStream.readLong());
		System.out.println(inDataStream.readFloat());
		System.out.println(inDataStream.readDouble());
		System.out.println(inDataStream.readChar());
		System.out.println(inDataStream.readBoolean());
		inDataStream.close();
		inDataStream.close();
		
		
	}

}
