package fajavaprogram;

import java.util.Scanner;

public class S_FindLengthOfString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int i=0;
		try {
		for( i=0; ch[i]!=' '; i++);
		}
		catch(Exception e) {}
		System.out.println("Size of String: "+i);	
	}
}
