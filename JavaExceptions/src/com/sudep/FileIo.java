package com.sudep;

import java.io.File;

public class FileIo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File directory = new File("/home/sudeep");
		String[] fileName = directory.list();
		for (String fname : fileName) {
			System.out.println(fname);

			String[] extArray = fname.split(".");
			if (extArray.length > 0) {
				System.out.println(extArray);
				if (extArray[1] == "sh")
					continue;
				System.out.println(fname);

			}
		}
	}

}
