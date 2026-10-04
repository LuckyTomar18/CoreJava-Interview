package com.rays.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class MargeFile {

	public static void main(String[] args) throws Exception {

		BufferedReader reader = new BufferedReader(new FileReader("D:\\IO\\merge.txt"));

		FileWriter writer = new FileWriter("D:\\IO\\merge1.txt");

		String str = reader.readLine();

		while (str != null) {

			System.out.println(str);
			writer.write(str + "\n");

			str = reader.readLine();

		}

		reader.close();

		reader = new BufferedReader(new FileReader("D: \\IO\\merge2.txt"));

		String str1 = reader.readLine();

		while (str1 != null) {

			System.out.println(str1);

			writer.write(str1);

			str1 = reader.readLine();

		}

		reader.close();
		writer.close();

	}

}
