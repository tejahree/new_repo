package com.bridgelabz.designpattern.factorypattern;

public class BMW implements Cars {

	@Override
	public void specification() {
		System.out.println("This is Bmw Car");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("BMW");
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("white");
	}

}
