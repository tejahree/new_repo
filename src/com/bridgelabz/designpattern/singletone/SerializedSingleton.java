package com.bridgelabz.designpattern.singletone;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	private static final long serialVersionUID = 1L;

	private SerializedSingleton() {
	}

	private static class SingletonInnerClass {
		private static final SerializedSingleton object = new SerializedSingleton();

	}

	public static SerializedSingleton getObject() {
		return SingletonInnerClass.object;
	}

	protected Object readResolve() {
		return getObject();
	}
}
