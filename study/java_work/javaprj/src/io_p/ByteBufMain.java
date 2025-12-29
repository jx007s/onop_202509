package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class ByteBufMain {
	
	 static void outBuf(byte [] ori, ByteArrayOutputStream bos) {
		byte [] buf = new byte[10];
		try {
			ByteArrayInputStream bis = new ByteArrayInputStream(ori);
			
			while(bis.available()>0) {
				int len = bis.read(buf);
				bos.write(buf,0,len);
				//System.out.println(Arrays.toString(buf));
			}
			
			bis.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		byte [] data1 = {1,3,5,7,9,11,13,15,17,19,21,23,25};
		byte [] data2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14};
		byte [] data3 = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};
		
		
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();

			outBuf(data1, bos);
			outBuf(data2, bos);
			outBuf(data3, bos);
						
			byte [] dst = bos.toByteArray();
			
			bos.close();
			
			System.out.println(Arrays.toString(dst));
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
