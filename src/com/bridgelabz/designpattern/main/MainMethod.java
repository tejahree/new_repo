package com.bridgelabz.designpattern.main;

import com.bridgelabz.designpattern.singletone.BillPughSingleztone;
import com.bridgelabz.designpattern.singletone.Eager;
import com.bridgelabz.designpattern.singletone.EnumsSingleton;
import com.bridgelabz.designpattern.singletone.LazyInitialization;
import com.bridgelabz.designpattern.singletone.StaticBlockSingletone;
import com.bridgelabz.designpattern.singletone.ThreadSafeSingleton;

public class MainMethod {
	public static void main(String[] args) {
		Eager.getObject();
		System.out.println(Eager.getObject().hashCode());
		System.out.println(Eager.getObject().hashCode());
		StaticBlockSingletone.getObject();
		LazyInitialization.getObject();
		ThreadSafeSingleton.getObject();
		ThreadSafeSingleton.getobjectByDoubleLock();
		BillPughSingleztone.getObject();
		System.out.println(EnumsSingleton.colour.INSTANCE.hashCode());
		System.out.println(EnumsSingleton.colour.print().hashCode());
		System.out.println(EnumsSingleton.colour.print().hashCode());
		//System.out.println(hashCode1);
	}
}
