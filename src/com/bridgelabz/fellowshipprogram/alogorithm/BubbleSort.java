package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String args[]) {
		int i, j, noOfElement, temp;
		System.out.println("Enter the Number of  element");
		Scanner scanner = new Scanner(System.in);
		noOfElement = scanner.nextInt();

		int array[] = new int[noOfElement];
		System.out.println("Enter the Array");
		for (i = 0; i < noOfElement; i++) {
			array[i] = scanner.nextInt();

		}

		for (i = 0; i < noOfElement - 1; i++)
			for (j = 0; j < noOfElement - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
		System.out.println("Sorted Array: ");
		for (int k = 0; k < noOfElement; k++) {

			System.out.print(array[k] + " ");
		}
	}
}