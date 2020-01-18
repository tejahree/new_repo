package com.bridgelabz.designpattern.singletone;

public class StaticBlockSingletone {
	private static final StaticBlockSingletone object;

	private StaticBlockSingletone() {
	}

	static {
		try {
			object = new StaticBlockSingletone();
		} catch (Exception e) {
			throw new RuntimeException("Exception occured in creating singleton instance");
		}
	}

	public static StaticBlockSingletone getObject() {
		System.out.println("this is object of staticBlock");
		return object;
	}
}
