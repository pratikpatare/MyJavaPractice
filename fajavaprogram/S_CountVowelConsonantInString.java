package fajavaprogram;

import java.util.Scanner;

public class S_CountVowelConsonantInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter String: ");
		String str=sc.nextLine();
		str=str.toLowerCase();
		
		int vCount=0, cCount=0;
		
		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i)=='a' || str.charAt(i)=='e' ||
				str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i)=='u') 
			{
				vCount++;
				
			}else  if(str.charAt(i)>='a' && str.charAt(i)<='z')
			{
				cCount++;
			}
	
		}
		System.out.println("Total vowels:"+vCount);
		System.out.println("Total consonants:"+cCount);
	}

}
