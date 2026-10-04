package com.rays.io.serializeDeserialize;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccountSD {

	public static void main(String[] args) throws Exception, IOException {

		Account account = new Account("505", 123.1);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\IO\\account1.txt"));

		// Convert Account class object into byte stream: serialization
		out.writeObject(account);

		out.close();

		ObjectInputStream input = new ObjectInputStream(new FileInputStream("D:\\IO\\account1.txt"));

		// Convert byte stream into Account class object: deserialization
		System.out.println(input.readObject());

		input.close();
	}
}
