package fajavaprogram;

public class S_CheckRotationInString {
	
	public static void main(String[] args) {
		
		String orgstr="pratik";
		String keystr="ratikp";
		
		String newstr=orgstr.concat(keystr);
		
		if(newstr.contains(keystr))
		{
			System.out.println("Rotational String");
		}else 
		{
			System.out.println("Not Rotational String");
		}	
	}	
}

/*	public static boolean isRotation(String s1, String s2) 
{
	return(s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1);
}
	public static void main(String[] args) {
		String s1="ABCD";
		String s2="CDAB";
	
		if(isRotation(s1,s2)) {
			System.out.println("Rotation is present");
		}else {
			System.out.println("Rotation is not present");
		}
*/			