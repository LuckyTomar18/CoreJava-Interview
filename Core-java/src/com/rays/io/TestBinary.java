package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TestBinary {

	public static void main(String[] args) throws Exception {

		FileInputStream input = new FileInputStream("D:\\io\\welcome.jpg");

		FileOutputStream output = new FileOutputStream("D:\\io\\welcomecopy.jpg");

		int ch = input.read();

		while (ch != -1) {

			System.out.println((char) ch);

			output.write(ch);

			ch = input.read();

		}

		input.close();
		output.close();
	}

}
