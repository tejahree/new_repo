package com.bridgelabz.fellowshipprogram.alogorithm;

import java.util.Scanner;

public class MergeSort {
	
	public static void mergeSort(String[] array,int l,int h){
		int mid;
		
		if(l<h){
			mid=(l+h)/2;
			
			mergeSort(array, l, mid);
			mergeSort(array,mid+1,h);
			merge(array,l,mid,h);
		}
		
		
	}
	public static void merge(String[] array,int l,int m,int h){

		int len1=m-l+1;
		int len2=h-m;
	String[] leftArray=new String[len1];
	String[] rightArray= new String[len2];
	for(int p=0;p<len1;++p) {
			leftArray[p]=array[l+p];
		}
		for(int q=0;q<len2;++q) {
			rightArray[q]=array[m+1+q];
		}
		int k=l;
		int i=0;
		int j=0;
		
		while(i<len1 && j<len2){
			if(leftArray[i].compareTo(rightArray[j])>0){
				
				array[k]=rightArray[j];
				j++;

			}
			else{
				array[k]=leftArray[i];
				i++;
				
				
			}
			k++;
		}

		 while (i < len1) 
	        { 
	            array[k] = leftArray[i]; 
	            i++; 
	            k++; 
	        }
		 while (j < len2) 
	        { 
	            array[k] = rightArray[j]; 
	            j++; 
	            k++; 
	        }
		printArray(array);
	}
	static void printArray(String[] array){
		int sizeOfArray= array.length;
		for(int i=0;i<sizeOfArray;i++){
			System.out.print(array[i]+"  ");
		}
		System.out.println();
		
	}
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter the number to element to sort\n");
	int sizeOfArray= scanner.nextInt();
	String[] array= new String[sizeOfArray];
	for(int i=0;i<sizeOfArray;i++){
		array[i]=scanner.next();
	}
printArray(array);
	mergeSort(array,0,sizeOfArray-1);
	System.out.println("this is sorted array\n");
	printArray(array);
}
}
