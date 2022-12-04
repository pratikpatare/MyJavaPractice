package fajavaprogram;

import java.util.Scanner;

public class N_ReverseNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();

		// 1 using algoritham
		   int rev=0;
		   while (num!=0)
		   { rev=rev*10 + num%10;
		     num=num/10; }
		 
		/* 2 using StringBuffer class 
		   
		   StringBuffer sb= new StringBuffer(String.valueOf(num));
		   StringBuffer rev=sb.reverse();
		*/
		/* 3 using StringBuilder class
		
			StringBuilder sb = new StringBuilder();
			sb.append(num);
			StringBuilder rev = sb.reverse();
		*/
		   System.out.println("Reverse number is:" + rev);
	}

}
