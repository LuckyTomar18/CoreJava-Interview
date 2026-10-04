package com.rays.io.serializeDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployeeEX {

	public static void main(String[] args) throws Exception, IOException {

		Employee em = new Employee("Ram", 1);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\IO\\Employee.txt"));

		out.writeObject(em);
		out.close();

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:\\IO\\Employee.txt"));

		System.out.println(input.readObject());
		input.close();
	}

}
