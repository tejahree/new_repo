package com.bridgelabz.designpattern.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import com.bridgelabz.designpattern.singletone.SerializedSingleton;

public class SingletonSerializedTest {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingleton objectOne = SerializedSingleton.getObject();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(objectOne);
		out.close();
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSingleton objectTwo = (SerializedSingleton) in.readObject();
		in.close();
		System.out.println("objectOneHashCode=" + objectOne.hashCode());
		System.out.println("objectTwoHashCode=" + objectTwo.hashCode());
	}
}
