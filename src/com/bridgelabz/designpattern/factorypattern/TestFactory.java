package com.bridgelabz.designpattern.factorypattern;

public class TestFactory {
public static void main(String[] args) {
	ComputerFactory com=new ComputerFactory();
	Computer object=com.getComputer("server", "2 GB", "500", "2.4");
	System.out.println(object);
}
}
