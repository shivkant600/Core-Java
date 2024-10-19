package Inputoutput;

import java.io.File;
import java.util.Date;

public class Textfile {
	public static void main(String[] args) {
		
		File f = new File("D:\\Io\\hello.txt");
		
		Date d = new Date(f.lastModified());
		
		
		System.out.println("file name=="+f.getName());
		
		System.out.println("read=="+f.canRead());
		
		System.out.println("write ="+f.canWrite());
		
		System.out.println("path="+f.getPath());
		System.out.println("file modified date"+d);
		
	
		
	}


	}


