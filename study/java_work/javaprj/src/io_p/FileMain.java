package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class FileMain {

	public static void main(String[] args) {
		try {
			InputStream fis = new FileInputStream("fff/family1.JPG");
			OutputStream fos = new FileOutputStream("ggg/home1.jpg");
			
			byte [] buf = new byte[8];
			
			while(fis.available()>0) {
				int len = fis.read(buf);
				fos.write(buf, 0, len);
				System.out.println(Arrays.toString(buf));
			}
			
			
			fos.close();
			fis.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
