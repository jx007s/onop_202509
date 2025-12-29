package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteInOutMain {

	public static void main(String[] args) {
		byte [] ori = {3,20,127,3,-128,-2,3,10,-1,50,111};
		
		ByteArrayInputStream bis = new ByteArrayInputStream(ori);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		while(bis.available()>0) {
			byte bb = (byte)bis.read();
			if(bb%2==0) {
				System.out.println(bb);
				bos.write(bb);
			}
		}
		
		byte [] dst = bos.toByteArray();
		
		try {
			
			bos.close();
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Arrays.toString(dst));

	}

}
