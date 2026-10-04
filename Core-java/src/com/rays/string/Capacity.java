package com.rays.string;

public class Capacity {
	public static void main(String[] args) {
		
	

	   StringBuffer sb = new StringBuffer("sandeep");
	   System.out.println("length11:"+sb.length());
	   System.out.println("capacity11:"+sb.capacity());
	   System.out.println(sb.append("abcdefghijklmnopqrstuvwxyz"));
	   System.out.println("length33:"+sb.length());
	   System.out.println("capacity33:"+sb.capacity());
	   System.out.println(sb.append("ggggggggggggg"));
	   System.out.println("length33:"+sb.length());
	   System.out.println("capacity33:"+sb.capacity());
	   
	}}