package fajavaprogram;

//Prime means number>1 n has only 2 factors=1 n itself.
//19=>1n19 so prime, 14=>1,2,7,14 so not prime
public class N_PrimeOrNot {

	public static void main(String[] args) {
		int num = 3;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2) {
				System.out.println("prime number");
			} else {
				System.out.println("not prime number");
			}
		} else {
			System.out.println("not prime number");
		}

	}

}
