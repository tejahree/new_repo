package com.bridgelabz.designpattern.singletone.example;

public class EagerInitialization {
public static void main(String[] args) {
	Singleton object=Singleton.getobject(); //if we create Singleton object= new Singleton(); means we are 
	//calling default constructor so to avoid default constructor 
	//Singleton class make its default constructor as private;
	//which make it Singleton class
	Singleton object2=Singleton.getobject();
	System.out.println(object.hashCode());
	System.out.println(object2.hashCode());
}
}
class Singleton{
	private static final  Singleton object=new Singleton();
	private Singleton() {
		
	}
	public static Singleton getobject() {
		System.out.println("this is object of eager singleton");
		return object;
	}
}