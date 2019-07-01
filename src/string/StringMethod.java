package string;

public class StringMethod {

	public static void main(String[] args) {
		String s1="Amit";
		String s2="Gupta";
		
		//length of string
		int stlen=s1.length();
		System.out.println("Length of string "+s1+" is"+stlen);
		
		//convert string to Array
		char c[]=s1.toCharArray();
		int arlen=c.length;
		System.out.println(arlen);
		
		//Find character at given index
		char a=s2.charAt(2);
		System.out.println("char at index 2 "+a);
		
		//concatenate two strings
		String s3=s1.concat(s2);
		System.out.println("String after concatenating "+s1+" and "+s2+" is "+s3);
		
		//remove spaces
		String s4="    Amit";
		System.out.println(s4.trim());
		
		//convert string to lowercase
		String s5=s1.toLowerCase();
		System.out.println("Lowecase :"+s5);
		
		//convert string to uppercase
		String s6=s2.toUpperCase();
		System.out.println("Uppercase :"+s6);
		
		//create substring 
		String s7=s1.substring(1,3);
		System.out.println("Substring :"+s7);
		
		
	}

}
