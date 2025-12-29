package io_p;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteInMain {

	public static void main(String[] args) {
		byte [] ori = {3,-128,-127,20,127,3,-3,-2,-1,0, 50,11};
		
		System.out.println(Arrays.toString(ori));
		
		//1. stream 생성
		ByteArrayInputStream bis = new ByteArrayInputStream(ori);
		
		System.out.println(bis.available());
		int rr = bis.read();		// 리턴이 -1 경우 읽을 데이터가 없다는 의미
		System.out.println(rr);
		rr = bis.read();
		System.out.println(rr);
		rr = bis.read();
		System.out.println(rr);
		System.out.println(bis.available());
		
		while(bis.available()>0) {
			System.out.println((byte)bis.read());
		}
		
		
		
		// stream 종료
		try {
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
