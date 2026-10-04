package com.rays.oop;

public class TestUserBean {

	public static void main(String[] args) {

		// ByObject
		UserBean bean = new UserBean();

		bean.setId(1);
		bean.setName("Sandeep");

		System.out.println(bean.getId());
		System.out.println(bean.getName());

		// By constructor
		UserBean bean1 = new UserBean(10, "mohit");

		System.out.println(bean1.getId());
		System.out.println(bean1.getName());

	}

}
