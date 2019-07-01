package com.array;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[];
		int b[];
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		a=new int[size];
		b=new int[size];
		//Input
		System.err.println("Enter the values in array");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value at "+i+"th position ");
			a[i]=sc.nextInt();		
		}
		
		//reversing array
		for(int i=0;i<size;i++) {
			b[i]=a[size-1-i];
		}
		
		System.out.println("Reversed array is ");
		for(int i=0;i<size;i++) {
			System.out.println(b[i]);
		}
		
	}

}
