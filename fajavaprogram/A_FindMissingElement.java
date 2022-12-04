package fajavaprogram;

//Array should not have duplicates
//Array no need to be sorted order
//Values should be in range
public class A_FindMissingElement {

	public static void main(String[] args) {
		int a[] = { 1, 2, 4, 5 };
		int sum1 = 0;
		int sum2 = 0;

		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("sum of elements in array:" + sum1);

		for (int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("sum of range of elements in array:" + sum2);

		System.out.println("missing number in array:" + (sum2 - sum1));

	}

}
