package io_p;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriterMain {

	public static void main(String[] args) {
		String ttt = "2026년은 병오년 happy new year!!!";
		
		char [] arr = ttt.toCharArray();
		
		try {
			Writer ww = new FileWriter("fff/ddd.txt", true);
							// false(생략시) : 새로 쓰기
							// true : 이전 내용 뒤에 붙여쓰기
			
			for (char c : arr) {
				ww.write(c);
			}
			
			ww.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
