package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufOutMain {

	public static void main(String[] args) {
		
		try {
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			byte [] buf = {11,22,33,44,55,66,77};
			
			bos.write(buf,2,3); //buf 배열 2번째 , 3개
			
			bos.write(buf,1,4); //buf 배열 1번째 , 4개
			
			bos.write(buf,4,2); //buf 배열 4번째 , 2개
			
			byte [] arr = bos.toByteArray();
			
			bos.close();
			
			System.out.println(Arrays.toString(arr));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}


/*
 * 
ByteBufMain
byte [] data1 = {1,3,5,7,9,11,13,15,17,19,21,23,25};
byte [] data2 = {-1,-2,-3,-4,-5,-6,-7,-8,-9,-10,-11,-12,-13,-14};
byte [] data3 = {101,102,103,104,105,106,107,108,109,110,111,112,113,114,115,116,117,118};

buf 를 이용하여 데이터를 읽어와서
한개의 배열로 출력하세요
 * */




