package com.bridgelabz.designpattern.adapterpattern;

public class School {
	public static void main(String[] args) {
		PenAdapter adapter = new PenAdapter();

		AssignmentWork aw = new AssignmentWork();
		aw.setP(adapter);
		// we cannot pass object of poiletpen to pp aw.setP(pp);
		// if we run this then this will throws null pointer exception
		// because in Assignment work we have not assign memory to pen reference
		// if we set aw.setP(get object of p ) as we dont have class which implement pen
		// interface
		// but we have poiletpen class who dont have any connection with pen interface
		// and we cannot change into poilepen class
		// so by using other class that is poiletpen we create an adapter
		aw.writeAssignment("assignment is done");
	}

}
