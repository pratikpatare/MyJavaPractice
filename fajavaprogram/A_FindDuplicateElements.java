package fajavaprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class A_FindDuplicateElements {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 1, 2};
/*
//Approach 1		
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("Found duplicate element:" + a[i]);
					flag = true;
				}
			}
		}
		if (flag == false) {
			System.out.println("Not found duplicate element:");
		}
*/
//Approach 2- By using HashSet collection bcoz duplicates are not allowed

		Set<Integer> hs=new HashSet<Integer>();
		for (int i : a) {
			if(!hs.add(i))
			{
				System.out.println("Duplicate element:"+i);
			}
		}
/*		
//	remove duplicates by using HashSet	
		
		Set <Integer> hs=new HashSet<Integer>();
		
		for (int i = 0; i < a.length; i++) {
			hs.add(a[i]);
			
		}
		Integer[] b=hs.toArray(new Integer[hs.size()]);
		System.out.println(Arrays.toString(b));	
*/			
	}

}
