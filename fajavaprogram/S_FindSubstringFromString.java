package fajavaprogram;

import java.util.Scanner;

public class S_FindSubstringFromString {

	public static void main(String[] args) {
		
		String s,s1;
		int i,j=0,count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter main string:");
		s=sc.nextLine();
		System.out.println("Enter substring:");
		s1=sc.nextLine();
		
		for(i=0; i<s.length(); i++) {
			if(s.charAt(i)==s1.charAt(j)) {
				j++;
			}else {
				j=0;
			}
			if(j==s1.length()) {
				j=0;
				System.out.println("substring found at index:"+(i-s1.length()+1));
				count++;
			}
		}
		System.out.println("substring found number of times: "+count);
	
	}
}
