package fajavaprogram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Z_WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
	FileWriter fw=new FileWriter("C:\\Users\\user\\Desktop\\Test.txt ");
	BufferedWriter bw=new BufferedWriter(fw);
		
	bw.write("Selenium with java");	
	bw.write("Pratik Patare");	
	
	System.out.println("Finished");
	bw.close();
	}

}
