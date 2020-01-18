package com.bridgelabz.designpattern.main;

import java.lang.reflect.Constructor;

import com.bridgelabz.designpattern.singletone.Eager;

/**
 * @author Teajshree Reflection: it is used to examine or modified the
 *         runtimeBehaviour of specific class
 *
 */
public class ReflectionMethodToBreakSingletone {
	public static void main(String[] args) {
		Eager eagerObjectOne = Eager.getObject();
		Eager eagerObjectTwo = null;
		try {
			// this Constructor[] Array is used to get declaredConstructor of
			// Eager class with array name constructor
			Constructor[] constructor = Eager.class.getDeclaredConstructors();
			// By iterating every value of constructor array
			for (Constructor constructor2 : constructor) {
				constructor2.setAccessible(true);
				// newInsatnce method create an object of of type Eager class and the give it to
				// eagerObjectTwo
				eagerObjectTwo = (Eager) constructor2.newInstance();
				break;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(eagerObjectOne.hashCode());
		System.out.println(eagerObjectTwo.hashCode());
	}
}
