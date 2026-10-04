package com.rays.io;

import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteCharByChar {

	
	public static void main(String[] args) throws Exception {
		
		
		FileReader reader = new FileReader("D:\\IO\\keyboard.txt" );
		
		FileWriter writer = new FileWriter("D:\\IO\\output.txt");
		
		int ch = reader.read();
		
		while(ch != -1) {
			
			System.out.println((char)ch);
			
			writer.write(ch);
			
			ch = reader.read();
		}
		
		reader.close();
		writer.close();
	}
}
