package fajavaprogram;

public class A_FindPairWithSum {

	public static void main(String[] args) {
		
		int a[] = { -1, 2, 1, 3, 5, 6, 2, 0 };
		int sum = 4;
		
		for (int i = 0; i <= a.length - 1; i++) {
			for (int j = i+1; j <= a.length - 1; j++) {
				if (a[i] + a[j] == sum)
					System.out.println(a[i] + " " + a[j]);
			}	
		}	
	}
}
