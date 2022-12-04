package fajavaprogram;

public class S_ReverseEachWordInString {

	public static void main(String[] args) {
//by using StringBuffer or StringBuilder
		
		String s = "Welcome to Java";
		String rev= "";
		String[] words = s.split(" ");
		
		for (String w : words) {
			StringBuilder sb = new StringBuilder(w);
			sb.reverse();
			rev = rev + sb.toString() + " ";
		}
		System.out.println(rev);
	}
}
