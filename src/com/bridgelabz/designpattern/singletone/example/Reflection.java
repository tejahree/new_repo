package com.bridgelabz.designpattern.singletone.example;

import java.lang.reflect.Constructor;

public class Reflection{
	public static void main(String[] args) {
		B newObject=B.getObject();
		B newObject1=null;
		try {
			Constructor[] constructor= B.class.getDeclaredConstructors();
			for(Constructor con: constructor) {
				con.setAccessible(true);
				newObject1=(B) con.newInstance();
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println(newObject.hashCode());
		System.out.println(newObject1.hashCode());
	}
}
class B{
	private B() {
		
	}
	private static class InnerB{
		 private static B object=new B();
	}
	public static B getObject() {
		return B.InnerB.object;
	}
}