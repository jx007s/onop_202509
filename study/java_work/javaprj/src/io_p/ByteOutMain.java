package io_p;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteOutMain {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		bos.write(34);
		bos.write(50);
		bos.write(-50);
		bos.write(127);
		bos.write(129);	//-127
		bos.write(-1);
		bos.write(-126);
		bos.write(254);	//-2
		bos.write(255);	//-1
		bos.write(256);
		bos.write(257);
		bos.write(300);  // 300-256
		
		byte [] dst = bos.toByteArray();
		
		System.out.println(Arrays.toString(dst));
		
		try {
			bos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

/*
ByteInOutMain

 3,20,127,3,-128,-2,3,10,-1,50,111
 stream을 이용하여 짝수로 구성된 배열을 출력하세요
 

 * */



