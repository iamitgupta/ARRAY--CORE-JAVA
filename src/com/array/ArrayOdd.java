package com.array;

public class ArrayOdd {

	public static void main(String[] args) {
		//declaration of array
		int a[];

		//creation of array
		a=new int[5];

		//initialization of array

		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		//utlization


		for(int i=0;i<5;++i) {
			if(i%2!=0) {
				System.out.println(a[i]);
				}
			}		
		}

}
