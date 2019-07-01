package string;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//Input from user
		System.out.println("Enter a string to check Palindrome: ");
		String s=sc.nextLine();
		
		String rev="";
		int len=s.length();
		
		//reverse String
		for(int i=0;i<len;i++) {
			rev+=s.charAt(len-i-1);
		}
		//checking if reverse string and given string are equals
		if(s.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}	
	}
}
