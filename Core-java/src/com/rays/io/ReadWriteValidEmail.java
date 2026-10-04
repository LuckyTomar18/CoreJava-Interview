package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadWriteValidEmail {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("D:\\IO\\email.txt"));

		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\IO\\valid.txt"));

		String email = reader.readLine();

		while (email != null) {

			if (email.endsWith("@gmail.com")) {

				System.out.println(email);

				writer.write(email);

				writer.newLine();

			}

			email = reader.readLine();

		}

		reader.close();
		writer.close();

	}

}
