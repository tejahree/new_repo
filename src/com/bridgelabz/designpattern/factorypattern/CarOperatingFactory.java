package com.bridgelabz.designpattern.factorypattern;

public class CarOperatingFactory {
public Cars getObject(String string) {
	if(string.equals("alto"))
		return new Alto();
	else if(string.equals("bmw"))
		return new BMW();
	else
		return new TataMotors();
}
}
