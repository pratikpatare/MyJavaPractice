package fajavaprogram;

//5!=5*4*3*2*1=120 or 5!=1*2*3*4*5=120
public class N_FindFactorial {

	public static void main(String[] args) {
		int num = 5;
		long factorial = 1;

		for (int i = 5; i >= 1; i--) // or go with ascending order
		{
			factorial = factorial * i;
		}
		System.out.println(factorial);

	}

}
