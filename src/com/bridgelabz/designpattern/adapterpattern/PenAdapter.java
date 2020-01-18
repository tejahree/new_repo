package com.bridgelabz.designpattern.adapterpattern;

public class PenAdapter implements Pen {

	PilotPen obj= new PilotPen();
	@Override
	public void writeUsingpen(String string) {
		obj.mark(string);
	}

}
