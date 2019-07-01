package com.array;

import java.util.Scanner;

public class ArrayWScanner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[];
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		a=new int[size];
		System.err.println("Enter the values in array");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value at "+i+"th position ");
			a[i]=sc.nextInt();
			
		}
		System.err.println("values in the array are");
		for(int i=0;i<size;i++) {
			System.out.println("Value at "+i+"th position is "+a[i]);
			
		}
		
	}

}
