package fajavaprogram;

import java.util.Arrays;
import java.util.Collections;

public class A_SortElementBuiltin {

	public static void main(String[] args) {
		
		Integer a[]= {30,20,50,10,40};
		System.out.println("Array before sorting:"+Arrays.toString(a));
		
//by using sort method or parallelsort method in ascending order	
		
		Arrays.sort(a);
		System.out.println("Array after sorting in ascending order:"+Arrays.toString(a));
		
//reverse or descending order. Declare Integer instead of int 
		
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array after sorting in descending order:"+Arrays.toString(a));
		
		
	}

}
