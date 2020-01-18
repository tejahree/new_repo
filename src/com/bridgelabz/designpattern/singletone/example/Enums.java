package com.bridgelabz.designpattern.singletone.example;

public class Enums {
	public static void main(String[] args) {
		EnumsContainingClass obj = EnumsContainingClass.Fixed.object;
		EnumsContainingClass obj1 = EnumsContainingClass.Fixed.object;
		System.out.println(obj.hashCode());
		System.out.println(obj1.hashCode());
	}
}

class EnumsContainingClass {
	private EnumsContainingClass() {

	}

	public enum Fixed {
		Instance;

		static EnumsContainingClass object = new EnumsContainingClass();
		/*
		 * public static EnumsContainingClass getObject(){ return object; }
		 */
	}
}