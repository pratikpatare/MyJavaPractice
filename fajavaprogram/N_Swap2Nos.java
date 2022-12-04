
package fajavaprogram;

public class N_Swap2Nos {

	public static void main(String[] args) {
		int a = 10, b = 20;

		System.out.println("Before swapping:" + a + " " + b);
// using third variable
		int temp = a;
		a = b;
		b = temp;
		
//without using third variable, use + & -
		a=a+b;
		b=a-b;
		a=a-b;
		
//use * & / , a&b values should not be zero
		a=a*b;
		b=a/b;
		a=a/b;
		
//using single statement
		b=a+b-(a=b);
		
		System.out.println("After swapping:" + a + " " + b);
	}

}
