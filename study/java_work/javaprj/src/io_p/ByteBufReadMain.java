package io_p;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteBufReadMain {

	public static void main(String[] args) {
		byte [] ori = {3,-128,55,66,77,88,99,115,-127,20,
					   127,100,111,120,3,-3,-2,-1,0, 50,11,33,66};
		
		
		byte [] buf = new byte[5];
		
		try {
			
			ByteArrayInputStream bis = new ByteArrayInputStream(ori);
			
			System.out.println(bis.available());
			System.out.println(Arrays.toString(buf));
			
			
							//buf에 담는다. buf 의 1번자리부터 3개
			int len = bis.read(buf,1,3);  
			System.out.println(bis.available()+" , "+len+" , "+Arrays.toString(buf));
			/*
			len = bis.read(buf);  //buf 크기 만큼 받아옴 -- 리턴 : 받아온 갯수
			System.out.println(bis.available()+" , "+len+" , "+Arrays.toString(buf));
			
			len = bis.read(buf);  //buf 크기 만큼 받아옴 -- 리턴 : 받아온 갯수
			System.out.println(bis.available()+" , "+len+" , "+Arrays.toString(buf));
			
			len = bis.read(buf);  //buf 크기 만큼 받아옴 -- 리턴 : 받아온 갯수
			System.out.println(bis.available()+" , "+len+" , "+Arrays.toString(buf));
			
			len = bis.read(buf);  //buf 크기 만큼 받아옴 -- 리턴 : 받아온 갯수
			System.out.println(bis.available()+" , "+len+" , "+Arrays.toString(buf));
			*/
		
		
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
