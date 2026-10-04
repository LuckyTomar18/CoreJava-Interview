package com.rays.networking.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) throws Exception, IOException {
		
		Socket client = new Socket("localhost", 1235);
		
		System.out.println("Connect to Server");
		
		BufferedReader reader  = new BufferedReader(new InputStreamReader(client.getInputStream()));
		
		DataOutputStream out = new DataOutputStream(client.getOutputStream());
		
		out.writeBytes("hellow server\n");
		
		String s = reader.readLine();
		
		System.out.println(s);
		
		client.close();
		
		System.out.println("Server close");
		
		
	}
	
}
