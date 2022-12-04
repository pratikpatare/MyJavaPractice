package fajavaprogram;

public class S_RemoveWhiteSpacesFromString {

	public static void main(String[] args) {

		String s="   selenium	with	Java ";
		System.out.println("Before removing white spaces:"+s);
		
		s=s.replaceAll("\\s", "");
		System.out.println("After removing white spaces:"+s);
	}

}
