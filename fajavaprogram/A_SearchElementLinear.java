package fajavaprogram;

public class A_SearchElementLinear {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 20, 30 };
		int search_ele = 30;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (search_ele == a[i]) {
				System.out.println("Element fount at index:" + i + " And element is: " + a[i]);
				flag = true;
				break;
			}
		}
		if (flag == false) {
			System.out.println("Element not found");
		}

	}

}
