package Inputoutput;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Writefile {

	public static void main(String[] args)throws Exception {
		
		FileWriter f = new FileWriter("D:\\Io\\shivkant.txt");
		
	// BufferedWriter w = new BufferedWriter(f);
		

	
		
		//char [] chararray= {'h','i'};
		
		//f.write(chararray);
		
		f.write(',');
		
		f.write("aman");
		
		f.write(',');
	
		f.write("choudhary");
		
		System.out.println("succesfull created file");
		
		f.close();

	}
}
