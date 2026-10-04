package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestFailSafe {
	
	public static void main(String[] args) {

		Vector v = new Vector();
 
		v.addElement('a');
		v.addElement('c');
		v.addElement('b');

		Enumeration e = v.elements();
		
		v.addElement('s');

		while (e.hasMoreElements()) {

			System.out.println(e.nextElement());

		}

	}


}
