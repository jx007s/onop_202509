package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.util.Date;

public class File2Main {

	public static void main(String[] args) throws Exception {
		File ff = new File("fff/aaa.txt");
		
		System.out.println(ff);
		System.out.println(ff.exists());
		System.out.println(ff.isFile());
		System.out.println(ff.isDirectory());
		System.out.println(ff.isAbsolute());
		System.out.println(ff.getParent());
		System.out.println(ff.getName());
		System.out.println(ff.getAbsolutePath());
		System.out.println(ff.getPath());
		System.out.println(ff.isHidden());
		System.out.println(ff.canExecute());
		System.out.println(ff.canRead());
		System.out.println(ff.canWrite());
		System.out.println(ff.length());
		System.out.println(new Date(ff.lastModified())  );
		
		//파일생성
		ff = new File("fff/ggg.txt");
		boolean bb = ff.createNewFile();
		System.out.println("파일생성:"+bb);
		

		bb = new File("fff/qqq").mkdir();
		System.out.println("폴더생성:"+bb);
		//new File("fff/rrr/uuu").mkdir();
		bb = new File("fff/rrr/uuu").mkdirs();
		System.out.println("폴더생성:"+bb);
		
		bb = new File("fff/ggg.txt").delete();
		System.out.println("파일삭제:"+bb);
		bb = new File("fff/qqq").delete();
		System.out.println("폴더삭제:"+bb);
		bb = new File("fff/rrr").delete();
		System.out.println("내용있는폴더삭제:"+bb);
		
		bb = new File("fff/ddd.txt").renameTo(new File("ggg/sss.txt"));
		System.out.println("파일이동:"+bb);
		
		//파일복사
		Files.copy(
				new File("fff/family1.JPG").toPath(), 
				new FileOutputStream("ggg/home3.jpg")
				);
		
		System.out.println("-----------------------");
		
		File [] arr = new File("fff").listFiles();
		
		for (File file : arr) {
			System.out.println(file.getName());
		}
	}

}


// FileDisMain
// ori.zip 을 압축해제 -> ori 폴더
//ori 폴더의 파일을 각각 종류별로 dst 폴더에 저장하시오
/// 하위 폴더까지 검색하세요
/// 같은 파일명인 경우 중복 처리 하세요
//이미지 : bmp, jpg, gif, png , jpeg
//음악 : mp3, wma, wav
//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
//기타 : 위의 분류 이외
//확장자의 대소문자 구분하지 않음







