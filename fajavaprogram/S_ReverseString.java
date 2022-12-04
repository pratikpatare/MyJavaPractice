package fajavaprogram;

import java.util.Scanner;

import datatype.ForLoop;

public class S_ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = sc.next();
/*		
//using string concatenation operator
		  String rev=""; 
		  int len=str.length();
		  
		  for(int i=len-1; i>=0; i--) 
		  { 
		  rev=rev+str.charAt(i);
		  }
		  System.out.println("Reverse string is:"+rev);
		 
		
//using character array
		  String rev=""; 
		  char a[]=str.toCharArray();
		  int len=a.length;
		  
		  for (int i=len-1; i>=0; i--) 
		  { 
			  rev=rev+a[i];
		  }
		  System.out.println("Reverse string is:"+rev);
*/		 
		  
// using stringbuffer class
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}
