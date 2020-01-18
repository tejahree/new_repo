package com.bridgelabz.designpattern.prototypepattern;

public class BookController {
	public static void main(String[] args) throws CloneNotSupportedException {

		AddressBook obj = new AddressBook();

		obj.setBookId(1);
		obj.loadData();

//here we want to assign the entire data of object 1 to object 2 the their is two option
//1.we can again fetch data form data base 
//2.we can clone the object 1 to object 2 means the data of object 1 can be copyed to data of object 2
//as 1 option will take two much time so we can go for option 2 
//clone method is marked as private so we are not able to see
//so for that implement cloneable interface so that we can able to used clone method 
//now we are able to clone object 1 to object 2
//but this cloning is called shallow clone mean changes in object 1 can effect to the copy of the other object
//we can avoid this problem by deep cloning 
		AddressBook obj1 = obj.clone();
		obj1.setBookId(2);
		System.out.println(obj1);
		obj.getList().remove(0);
		System.out.println(obj);
	}
}
