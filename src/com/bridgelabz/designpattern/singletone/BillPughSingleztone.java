package com.bridgelabz.designpattern.singletone;

public class BillPughSingleztone {
	private BillPughSingleztone() {
	}

	private static class InnerStaticClass {
		private static BillPughSingleztone object = new BillPughSingleztone();

	}

	public static BillPughSingleztone getObject() {
		System.out.println("this is BillPughSingleton");
		return InnerStaticClass.object;
	}
}
