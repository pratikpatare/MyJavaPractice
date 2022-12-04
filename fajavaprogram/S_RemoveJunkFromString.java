package fajavaprogram;

public class S_RemoveJunkFromString {

	public static void main(String[] args) {
		String s = "Java8 with selenium ~!@#$%^&*()_+";

		s = s.replaceAll("[^a-z,A-Z,0-9]", " ");
		System.out.println(s);

	}

}
