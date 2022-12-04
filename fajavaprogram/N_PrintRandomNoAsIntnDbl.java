package fajavaprogram;

import java.util.Random;

public class N_PrintRandomNoAsIntnDbl {

	public static void main(String[] args) {
//generate random numbers by using Random class
		Random rand = new Random();
		
		int rand_int = rand.nextInt(100);
		System.out.println(rand_int);

		double rand_dbl = rand.nextDouble(100);
		System.out.println(rand_dbl);

//generate random numbers by using Math class
//		System.out.println(Math.random());

//generate random numbers n strings by using Apache commons-lang API (do this)

	}

}
