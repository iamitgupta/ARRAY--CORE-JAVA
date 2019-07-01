package com.array;

public class Frequency {

	public static void main(String[] args) {
		int a[]= {1,2,3,1,2,3,1,1};
		int len=a.length;
		int f[]=new int[len];
		int count;
		
		
		for(int i=0;i<len-1;i++) {
			f[i]=0;
		}
		for(int j=0;j<len;j++) {
			if(a[j]!=0) {
			count=1;
			for(int i=j+1;i<len;i++) {
			if(a[j]==a[i]) {
				a[i]=0;
				count++;
			}
			f[j]=count;
		}
		}
		}
		for(int i=0;i<len;i++) {
			if(f[i]!=0) {
			System.out.println(a[i]+" has occured "+f[i]+" times");
			}
		}
		
	}

}
