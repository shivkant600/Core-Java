package Inputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadwriteBinaryData {
	
	public static void main(String[] args)throws Exception {
		String source =    "D:\\Io\\rayslogo.png";
		
		String target = "D:\\Io\\rayslogo2.png";
		
		FileInputStream in = new FileInputStream(source);
		
		FileOutputStream out = new FileOutputStream(target);
		
		int i = in.read();
		
		while (i != -1) {
			System.out.println(i);
			
			out.write(i);
			
			i = in.read();
		}
		System.out.println("image write succesfully");
		
		in.close();
		out.close();
	}

}
