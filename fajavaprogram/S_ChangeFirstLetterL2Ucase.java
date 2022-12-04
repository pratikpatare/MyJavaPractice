package fajavaprogram;

import java.util.StringTokenizer;

public class S_ChangeFirstLetterL2Ucase {

	public static void main(String[] args) {

		String str= "i am pratik from nagar";
		StringTokenizer t1=new StringTokenizer(str);
		String result="";
		
		while(t1.hasMoreTokens())
		{
		String s1=t1.nextToken();
		s1=s1.substring(0,1).toUpperCase()+s1.substring(1);
		result=result + s1+" ";
		}
		System.out.println(result);
		}		
}
