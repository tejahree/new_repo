package com.bridgelabz.designpattern.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class AddressBook implements Cloneable {
	private int bookId;
	private List<Person> list = new ArrayList<Person>();

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public List<Person> getList() {
		return list;
	}

	public void setList(List<Person> list) {
		this.list = list;
	}

	public void loadData() {
		for (int i = 1; i <= 10; i++) {
			Person obj = new Person();
			obj.setPid(i);
			obj.setPname("person" + i);
			getList().add(obj);

		}
	}

	@Override
	protected AddressBook clone() throws CloneNotSupportedException {
		AddressBook object = new AddressBook();
		// here we are fetching data
		for (Person a : this.getList()) {
			// get one one data and add to the new object
			object.getList().add(a);
		}
		return object;
	}

	@Override
	public String toString() {
		return "AddressBook [bookId=" + bookId + ", list=" + list + "]";
	}

}
