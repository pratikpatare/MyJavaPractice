package fajavaprogram;

public class A_PrintIntersection {

	public static void main(String[] args) {
		
		int a1[] = { 1, 2, 3, 5, 7, 9 };
		int a2[] = { 2, 4, 3, 9, 7, 8 };
		
		int m = a1.length;
		int n = a2.length;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (a1[i] == a2[j]) {
					System.out.println(a1[i]);
				}
			}
		}
	}
}
