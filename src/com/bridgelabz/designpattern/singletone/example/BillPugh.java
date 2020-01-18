package com.bridgelabz.designpattern.singletone.example;

public class BillPugh {
	public static void main(String[] args) {
		OuterClass object1 = OuterClass.getObject();
		OuterClass object2 = OuterClass.getObject();
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
	}
}

class OuterClass {
	private OuterClass() {
		System.out.println("this is object of billPugh");
	}

	// as inner class is load in memory whenever it has been call we in that we
	// create object of outer class we whenever inner class called it create 
	//object of  that class
	private static class InnerClass {
		private static OuterClass object = new OuterClass();
	}

	public static OuterClass getObject() {
		return OuterClass.InnerClass.object;
	}
}