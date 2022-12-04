package fajavaprogram;

public class S_ReverseSentence {
	public static void main (String args[]) {
		
		String s = " I live in India"; 
		String[] s1 = s.split(" ");
		String rev="";
		
		for(int i = s1.length - 1; i>=0; i--)
		{
		rev = rev + (s1[i] + " ");
		}
		System.out.println(rev);
	}
}
