package com.bridgelabz.designpattern.singletone;

public class EnumsSingleton {
public enum colour{
	INSTANCE;
	public static EnumsSingleton print() {
		EnumsSingleton object= new EnumsSingleton();
		System.out.println("this is enums object");
		return object;
	}
	}


}
