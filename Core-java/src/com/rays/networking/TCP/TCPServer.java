package com.rays.networking.TCP;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {

		ServerSocket server = new ServerSocket(1235);

		System.out.println("server waiting for client...");

		Socket client = server.accept(); 

		BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));

		DataOutputStream out = new DataOutputStream(client.getOutputStream());

		out.writeBytes("Hellow client\n");

		String s = reader.readLine();
		System.out.println(s);

		client.close();

		server.close();

	}

}
