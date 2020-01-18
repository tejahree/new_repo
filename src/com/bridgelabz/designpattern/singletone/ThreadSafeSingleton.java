package com.bridgelabz.designpattern.singletone;

public class ThreadSafeSingleton {
	private static ThreadSafeSingleton object;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getObject() {
		if (object == null) {
			object = new ThreadSafeSingleton();

		}
		System.out.println("This is object of ThreadSafeSingleton");
		return object;
	}

	public static ThreadSafeSingleton getobjectByDoubleLock() {
		if (object == null) {
			synchronized (ThreadSafeSingleton.class) {
				if (object == null) {
					object = new ThreadSafeSingleton();
				}
			}
		}
		System.out.println("This is doubleSynchronized Method of threadSafeSingleton");
		return object;
	}
}
