package fajavaprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Z_ReadDataFromTextFile {

	public static void main(String[] args) throws FileNotFoundException  {
//1-by using FileReader and BufferedReader class
//2-by using File and Scanner class
		
		File file=new File("C:\\Users\\user\\Desktop\\Test.txt");
		Scanner sc= new Scanner(file);
		
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
/*instead of while loop
		sc.useDelimiter("\\Z");
		System.out.println(sc.next()); */
	}

}
