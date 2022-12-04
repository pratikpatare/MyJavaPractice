package fajavaprogram;

import java.util.Arrays;

public class S_SortListOfStrings {

	public static void main(String[] args) {
		
		String[] str = { "Jan", "Feb", "Mar", "Apr", "May", 
				"Jun", "Jul", "aug", "Sep", "Oct", "nov","Dec" };
				
		System.out.print("Case sensitive Sorting:");
		
			Arrays.sort(str);
		
			for (String s : str) 
			{
				System.out.print(" "+s);
			}
			System.out.println();
//		
		System.out.print("Case insensitive Sorting:");
			
			Arrays.sort(str, String.CASE_INSENSITIVE_ORDER);
			
			for (String s : str)
			{
				System.out.print(" "+s);
			}
	}
}