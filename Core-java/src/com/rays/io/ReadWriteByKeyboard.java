package com.rays.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWriteByKeyboard {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		FileWriter writer = new FileWriter("D:\\IO\\sandeep.txt");

		System.out.println("Enter here . . . .");

		String str = reader.readLine();

		while (str != null) {

			writer.write(str);
			

			System.out.println(str);
//			str = null;
			
			
			//break
			
			
//			 if (str.equalsIgnoreCase("exit")) {
//			        str = null;   // manually null kiya
//			    } else {
//			        str = reader.readLine();
//			    }

			str = reader.readLine();
			
			
		}

		reader.close();
		writer.close();
	}

}
