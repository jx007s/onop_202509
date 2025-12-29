package io_p;

import java.io.FileOutputStream;
import java.util.Arrays;

public class FileOutMain {

	public static void main(String[] args) {
		String str = "qwer yuioreuyw cvnskjdfnv\n 1029384756 \n개나리 개나리 얼룩 개나리 \n%^$&#*@(!)";
		
		System.out.println(str);
		
		byte [] arr = str.getBytes();
		System.out.println(Arrays.toString(arr));
		
		try {
			FileOutputStream fos = new FileOutputStream("fff/bbb.txt");
			
			fos.write(arr);
			
			fos.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

/*

FileMain
fff/ccc.txt  ==>   ggg/ddd.txt   복사하세요

 * */



