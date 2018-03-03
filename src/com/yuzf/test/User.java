package com.yuzf.test;

public class User {
	
	private People people;
	
	public User(People people) {
		this.people = people;
	}
	
	public void test() {
		people.test();
//		System.out.println("Jamesharden牛逼！！！");
	}
	
}
