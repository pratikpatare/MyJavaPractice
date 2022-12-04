package fajavaprogram;

public class A_FindEvenOddElements {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		
		/*
		 * // by using for loop System.out.println("Even numbers:"); for(int i=0;
		 * i<a.length; i++) { if (a[i]%2==0) System.out.println(a[i]); }
		 * 
		 * System.out.println("Odd numbers:"); for(int i=0; i<a.length; i++) {
		 * if(a[i]%2!=0) System.out.println(a[i]); }
		 */
		 
//	by using for each loop
		System.out.println("even numbers:");
		for (int value : a) {
			if (value % 2 == 0)
				System.out.println(value);
		}
		System.out.println("odd numbers:");
		for (int value : a) {
			if (value % 2 != 0)
				System.out.println(value);
		}

	}

}
