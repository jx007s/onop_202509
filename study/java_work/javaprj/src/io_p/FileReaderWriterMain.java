package io_p;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileReaderWriterMain {

	public static void main(String[] args) {
		try {
			Reader rr = new FileReader("fff/aaa.txt");
			Writer ww = new FileWriter("ggg/eee.txt");
			
			char [] buf = new char[8];
			
			while(true) {
				int len = rr.read(buf);
				if(len<0) {
					break;
				}
				
				String ttt = new String(buf,0,len);
				System.out.println(ttt+" : "+len);
				ww.write(ttt);
			}
			
			
			ww.close();
			rr.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
/*
FileExamMain

fff/exam.txt 파일을 만들고  파일 내용에 총점, 평균, 등수를 계산하여
ggg/examRes.txt 파일로 저장하시오

fff/exam.txt 
장동건_77,78,75
장서건_67,68,65
장남건_97,98,95
갓동규_57,58,55
갓짝퉁_87,88,85

ggg/examRes.txt
장동건_77,78,75,총점,평균,등수

 * */



