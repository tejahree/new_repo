package com.bridgelabz.designpattern.factorypattern;

public class Factory {
	public static void main(String[] args) {
		CarOperatingFactory object= new CarOperatingFactory();
		Cars cars= object.getObject("tatamotor");
		cars.specification();
		cars.colour();
		cars.name();
	}


}
