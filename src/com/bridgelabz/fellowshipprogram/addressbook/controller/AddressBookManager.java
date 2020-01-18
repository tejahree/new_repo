package com.bridgelabz.fellowshipprogram.addressbook.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.bridgelabz.fellowshipprogram.addressbook.model.Address;
import com.bridgelabz.fellowshipprogram.addressbook.model.AddressBook;
import com.bridgelabz.fellowshipprogram.addressbook.model.AddressBookList;
import com.bridgelabz.fellowshipprogram.addressbook.model.Person;
import com.bridgelabz.fellowshipprogram.addressbook.repository.JsonOperation;
import com.bridgelabz.fellowshipprogram.addressbook.services.AddressBookMethods;
import com.bridgelabz.fellowshipprogram.addressbook.utility.Utility;


public class AddressBookManager {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Utility utility = new Utility();
		AddressBookMethods manager = new AddressBookMethods();
		Map<Integer, ArrayList<Person>> map = new HashMap<Integer, ArrayList<Person>>();
		ArrayList<Person> sortedList = new ArrayList<Person>();
		ArrayList<AddressBook> list = new ArrayList<AddressBook>();
		ArrayList<Person> listOfPersons = new ArrayList<Person>();
		JsonOperation operation = new JsonOperation();
		int option = 0;
		String filepath;
		while (option != 5) {
			System.out.println("-----------Welcome to AddressLibrary----------\n");
			System.out.println("-------Option for ListOfAddress------\n");
			System.out.println("1.Create New AddressBook\n");
			System.out.println("2.Open AddressBook\n");
			System.out.println("3.Save AddressBook\n");
			System.out.println("4.Save As AddressBook\n");
			System.out.println("5.Close AddressBookLibrary\n");

			System.out.println("Enter Option\n");

			option = utility.integerValue();
			switch (option) {
			case 1:
				System.out.println("-----Wel-come for addresss book creation-----\n");
				System.out.println("Enter id of Address-Book\n");
				int id = scanner.nextInt();
				System.out.println("Enter the name of address book\n");
				String name = scanner.next();
				Address add;
				list.add(new AddressBook(id, name, listOfPersons));
				AddressBookList listOfAddress = new AddressBookList();
				listOfAddress.setListOfAddress(list);

				map.put(id, listOfPersons);
				int optionnew = 0;
				while (optionnew != 6) {
					System.out.println("-----AddressBook option-------");
					System.out.println("1.Add person\n");
					System.out.println("2.Edit person Detail\n");
					System.out.println("3.Print by sortedLastName\n");
					System.out.println("4.Print by SortedZip\n");
					System.out.println("5.Delet Person\n");
					System.out.println("6.Close Address Book\n");
					System.out.println("Enter Option\n");
					optionnew = scanner.nextInt();
					switch (optionnew) {
					case 1:
						System.out.println("Welcome to Added person\n");
						listOfPersons = manager.createNewBook(listOfPersons);
						break;
					case 2:
						System.out.println("Welcom to Edit");
						listOfPersons = manager.editNewbook(listOfPersons);
						break;
					case 3:
						System.out.println("Welcome to sortBy LastName\n");
						sortedList = manager.sortByName(listOfPersons);
						manager.printBySortedName(sortedList);
						filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/addressbook/listOFSortedPersonByName.json";
						operation.toWriteIntoFile(filepath, sortedList);
						System.out.println("Person Data is Successfully Saved");
						break;
					case 4:
						System.out.println("Welcome to sortBy Zip\n");
						sortedList = manager.sortByZip(listOfPersons);
						manager.printBySortedPersonZip(sortedList);
						filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/addressbook/listOfSortedPersonByZip.json";
						operation.toWriteIntoFile(filepath, sortedList);
						System.out.println("Person Data is Successfully Saved");
						break;
					case 5:
						System.out.println("Welcome to DeletePerson\n");
						listOfPersons = manager.deletePerson(listOfPersons);
						break;
					case 6:
						System.out.println("So AddressBookID:" + id + "AddressBookName:" + name + "is been Closed\n");
						break;
					default:
						System.out.println("please enter validate option\n");
						break;
					}
				}
				break;
			case 2:
				System.out.println("-----Wel-come for addresss book opening-----\n");
				System.out.println("Enter the AddressBook id to open\n");
				int bookid = scanner.nextInt();
				ArrayList<Person> listInMap;
				if (map.containsKey(bookid)) {
					listInMap = map.get(bookid);
					int optionopen = 0;
					while (optionopen != 6) {
						System.out.println("-----AddressBook option-------");
						System.out.println("1.Add person\n");
						System.out.println("2.Edit person Detail\n");
						System.out.println("3.Print by sortedLastName\n");
						System.out.println("4.Print by SortedZip\n");
						System.out.println("5.Delet Person\n");
						System.out.println("6.Close Address Book\n");
						System.out.println("Enter Option\n");
						optionopen = scanner.nextInt();
						switch (optionopen) {
						case 1:
							System.out.println("Welcome to Added person\n");
							listOfPersons = manager.createNewBook(listInMap);
							break;
						case 2:
							System.out.println("Welcom to Edit");
							listOfPersons = manager.editNewbook(listInMap);
							break;
						case 3:
							System.out.println("Welcome to sortBy LastName\n");
							sortedList = manager.sortByName(listInMap);
							manager.printBySortedName(sortedList);
							filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/addressbook/listOFSortedPersonByName.json";
							operation.toWriteIntoFile(filepath, sortedList);
							System.out.println("Person Data is Successfully Saved");
							break;
						case 4:
							System.out.println("Welcome to sortBy Zip\n");
							sortedList = manager.sortByZip(listInMap);
							manager.printBySortedPersonZip(sortedList);
							filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/addressbook/listOfSortedPersonByZip.json";
							operation.toWriteIntoFile(filepath, sortedList);
							System.out.println("Person Data is Successfully Saved");
							break;
						case 5:
							System.out.println("Welcome to DeletePerson\n");
							listOfPersons = manager.deletePerson(listInMap);
							break;
						case 6:
							System.out.println("So AddressBookID:" + bookid);
							break;
						default:
							System.out.println("please enter validate option\n");
							break;
						}
					}
				} else {
					System.out.println("Such AddressBook with" + bookid + "is not present \n");
				}
				break;
			case 3:
				System.out.println("---------Save---------\n");
				filepath = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/addressbook/SaveFileOfPerson.json";
				System.out.println("1.Save Specific Address-Book\n");
				System.out.println("2.Save Entire Address-Book System\n");
				int choise = utility.integerValue();
				ArrayList<Person> listToPrint;
				switch (choise) {
				case 1:
					System.out.println("Enter Address-Book id\n");
					int Id = utility.integerValue();
					if (!map.containsKey(Id))
						System.out.println("No such Address-Book found");
					listToPrint = map.get(Id);
					operation.toWriteIntoFile(filepath, listToPrint);
					System.out.println("Records of Address-Book is Save Successfully");
					break;
				case 2:
					operation.toWriteIntoFile(filepath, list);
					System.out.println("Records of Address-Book is Save Successfully");
					break;
				}

				break;
			case 4:
				System.out.println("-------welcome to save as file-----\n");
				System.out.println("enter the name of file\n");
				String fileName = scanner.next();
				String file = "/home/admin1/Desktop/BridgeLabzPrograms/JsonProject/src/com/bridgelabz/fellowshipprogram/oops/addressbook/"
						+ fileName + ".json";
				operation.toWriteIntoFile(file, list);
				System.out.println("You Data is Successfully Save");
				break;

			case 5:
				System.out.println("------Thank u for operating r libaray-------");
				break;
			default:
				System.out.println("Please Enter Valide Option\n");
				break;
			}
		}
		scanner.close();
	}
}
