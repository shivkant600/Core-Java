package Inputoutput;

import java.io.FileReader;

public class Readfile {
	public static void main(String[] args) throws Exception {

		FileReader r = new FileReader("D:\\Io\\hello.txt");

		int i = r.read();

		char ch;

		while (i != -1) {
			ch = (char) i;

			System.out.println(ch);

			i = r.read();
		}

		r.close();
	}

}
