package com.bridgelabz.designpattern.singletone.example;

//static block provide exception handling while creating a new object 
public class StaticBlock {
	public static void main(String[] args) {
		StaticSingleton object = StaticSingleton.getObject();

		System.out.println(object.hashCode());
		StaticSingleton.getObject();
	}
}

class StaticSingleton {
	private static StaticSingleton object;

	private StaticSingleton() {

	}

	static {
		try {
			object = new StaticSingleton();
		} catch (Exception e) {
			throw new RuntimeException("Exception occur while creating new object");
		}
	}

	public static StaticSingleton getObject() {
		System.out.println("this is static block initialization");
		return object;
	}
}