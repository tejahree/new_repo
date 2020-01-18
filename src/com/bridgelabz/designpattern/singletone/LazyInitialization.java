package com.bridgelabz.designpattern.singletone;

public class LazyInitialization {
	private static LazyInitialization  object;

	private LazyInitialization() {}
	public static LazyInitialization getObject() {
		if(object==null) {
			object=new LazyInitialization();
		}
		System.out.println("This is Lazy Initilazation");
		return object;
	}

}
