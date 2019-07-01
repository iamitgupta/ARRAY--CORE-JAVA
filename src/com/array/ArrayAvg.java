package com.array;

import java.util.Scanner;

public class ArrayAvg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[];
		double sum=0,avg;
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		a=new int[size];
		System.err.println("Enter the values in array");
		for(int i=0;i<size;i++) {
			System.out.println("Enter the value at "+i+"th position ");
			a[i]=sc.nextInt();		
		}
		//calculating sum of array
		for(int i=0;i<size;i++) {
			sum+=a[i];
		}
		//calculating average
		avg=sum/size;
		
		System.out.println("Average of ");
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println("is "+avg);
		
	}

}
