package com.rays.networking.URL;

import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;


public class URLReader {

	public static void main(String[] args) throws Exception {

		URL url = new URL("https://erp.sunilos.com/NCSA/#/Test");

		System.out.println("Protocol = " + url.getProtocol());
		System.out.println("Port = " + url.getPort());
		System.out.println("HostName = " + url.getHost());
		System.out.println("File = " + url.getFile());
		
		
		  // URL se data read karne ke liye stream open kiya
		InputStream in = url.openStream();
		
		 // Scanner se content ko line-by-line read karenge
		Scanner sc = new Scanner(in);
		
		
		while(sc.hasNext()) {
			
			System.out.println(sc.nextLine());
			
			
		}

	}

}
