package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestEnumration {
	
	public static void main(String[] args) {
		
		
		Vector v= new Vector();
		
		v.addElement(12);
		v.addElement(11);
		v.addElement(13);

		
		Enumeration e  = v.elements();
		
		
		while (e.hasMoreElements()) {
			
			System.out.println(e.nextElement());
		}
		
	}

}
