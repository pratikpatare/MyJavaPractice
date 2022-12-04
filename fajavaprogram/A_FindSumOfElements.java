package fajavaprogram;

public class A_FindSumOfElements {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int sum = 0;

		/*
		 * for (int i = 0; i <= a.length - 1; i++) { sum = sum + a[i]; }
		 */

// by using for_each loop or enhanced for loop
		for (int i : a) {
			sum = sum + i;
		}

		System.out.println("Sum of Array elements:" + sum);
	}

}
