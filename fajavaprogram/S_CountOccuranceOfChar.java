package fajavaprogram;

public class S_CountOccuranceOfChar {

	public static void main(String[] args) {
/*		String s = "java with selenium";

		int totalcount = s.length();

		int totalcount_afterRemove = s.replace("a", "").length();

		int count = totalcount - totalcount_afterRemove;

		System.out.println("Number of occurances of a:" + count);
*/
		String str= "elephant";
		char e = 'e';
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == e) {
				count++;
			}
		} 
		System.out.println("Number of occurances of e:"+count);
	}

}
