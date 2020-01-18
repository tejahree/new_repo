package com.bridgelabz.designpattern.adapterpattern;

public class AssignmentWork {
	private Pen p;

	public Pen getP() {
		return p;
	}

	public void setP(Pen p) {
		this.p = p;
	}

	public void writeAssignment(String string) {
 p.writeUsingpen(string);
	}
}
