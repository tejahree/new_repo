package com.bridgelabz.designpattern.singletone;

public class Eager {
	// this is final object of class
	private static final Eager object = new Eager();

	// this is private constructor to avoid calling of default constructor
	private Eager() {
	}

	// this is getMethod
	public static Eager getObject() {
		System.out.println("this is instance of Eager\n");
		return object;
	}
}
