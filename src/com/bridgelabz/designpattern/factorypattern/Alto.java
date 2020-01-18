package com.bridgelabz.designpattern.factorypattern;

public class Alto implements Cars{

	@Override
	public void specification() {
		System.out.println("This is Alto Car");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Alto");
		
	}

	@Override
	public void colour() {
		// TODO Auto-generated method stub
		System.out.println("red");
	}

}
