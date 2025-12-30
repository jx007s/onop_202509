package io_p;

import java.io.FileReader;
import java.io.Reader;

public class FileReaderMain {

	public static void main(String[] args) {
		try {
			Reader rr = new FileReader("fff/aaa.txt");
			
			//while(rr.available()>0) {}
			
			int data;
			while((data=rr.read())!=-1) {
				System.out.print((char)data);
			}
			
			rr.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
