package com.array;

import java.util.Scanner;

public class PalindromeNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[];
		boolean flag=true;
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		a=new int[size];
		System.err.println("Enter the values in array");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value at "+i+"th position ");
			a[i]=sc.nextInt();		
		}
		//palindrome logic
		for(int i=0;i<size/2;i++) {
			if(a[i]!=a[size-i-1]) {
				flag=false;
				break;
			}
		}
		//checking palindrome
		if(flag) {
		System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
	}

}
