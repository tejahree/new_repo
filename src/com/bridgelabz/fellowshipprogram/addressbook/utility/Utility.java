package com.bridgelabz.fellowshipprogram.addressbook.utility;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utility {

	static Scanner sc = new Scanner(System.in);

	public static String[] bubblesortForStringArray(String[] arr) {
		String temp;
		for (int i = 0; i < (arr.length) - 1; i++)
			for (int j = 0; j < (arr.length) - 1; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		return arr;
	}

	public static int[] bubblesort(int[] arr) {
		int temp;
		for (int i = 0; i < (arr.length) - 1; i++)
			for (int j = 0; j < (arr.length) - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		return arr;
	}

	public int integerValue() {
		int number = 0;
		try {
			number = sc.nextInt();
			return number;
		} catch (Exception e) {
			System.out.println("Enter the Only Integer");
			sc.next();
			number = integerValue();
		}
		return number;
	}

	public static String stringValue() {
		try {
			return sc.next();
		} catch (Exception e) {
			System.out.println("Please enter valide option\\n");
		}
		return null;

	}

	public static long longValue() {
		try {
			return sc.nextLong();
		} catch (Exception e) {
			System.out.println("Please enter valide option\n");
		}
		return 9;
	}

	public static boolean phoneNumberValidation(String contact) {
		String value = "^\\d{10}";
		if (contact.matches(value))
			return true;
		else
			return false;
	}

	public static boolean dateValidation(String date) {
		String value = "((([0]{1}[1-9]{1})|([1]{1}[0-9]{1})|([2]{1}[0-9]{1})|([3]{1}[0-1]{1}))/(([0]{1}[1-9]{1})|([1]{1}[0-2]{1}))/([1-9]{1}[0-9]{1}[0-9]{1}[1-9]{1}))";
		if (date.matches(value))
			return true;
		else
			return false;

	}
}
