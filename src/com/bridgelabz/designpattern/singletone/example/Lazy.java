package com.bridgelabz.designpattern.singletone.example;

public class Lazy {
	public static void main(String[] args) {
		A object = A.getObject();
}
}

class A {
	//lazy initialization create object when method is called by other class
	//here we have just define object
	private static A object;

	private A() {
		System.out.println("object of Singleton");
	}
//if object ==null means object is creating for first time so its allow for creating 
	//the object 
	public static A getObject() {
		if (object == null) {
			object = new A();
		}
		return object;
	}
}