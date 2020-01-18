package com.bridgelabz.designpattern.singletone.example;

public class ThreadSafe {

	public static void main(String[] args) {
		Abc abc = Abc.getObject();
		Abc abc2 = Abc.getObject();
		System.out.println(abc.hashCode());
		System.out.println(abc2.hashCode());
	}
}

class Abc {
	private static Abc object;

	private Abc() {
		System.out.println("this is threadSafe initialization");
	}

	// lazy work fine for one thread application but when its for multiple threads
	// its create multiple object so to avoid this we used synchronized word
	public static synchronized Abc getObject() {
		if (object == null) {
			object = new Abc();
		}
		return object;
	}
}