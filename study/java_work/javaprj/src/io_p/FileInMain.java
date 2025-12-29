package io_p;

import java.io.FileInputStream;
import java.util.Arrays;

public class FileInMain {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("fff/aaa.txt");
			
//			while(fis.available()>0) {
//				System.out.print((char)fis.read());
//			}
			
			byte [] dst = new byte[100];
			int len = fis.read(dst);
			System.out.println(len);
			System.out.println(Arrays.toString(dst));
			String ttt = new String(dst);
			
			System.out.println(ttt);
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
