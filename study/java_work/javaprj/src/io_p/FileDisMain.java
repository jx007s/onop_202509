package io_p;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.util.HashMap;

public class FileDisMain {
	
	void dirGo(File dir) {
		File [] arr = dir.listFiles();
		
		for (File file : arr) {
			if(file.isDirectory()) {
				dirGo(file);
			}else {
				System.out.println(file.getName());
				
				String dst  = "기타";
				String ext = file.getName().substring(file.getName().lastIndexOf(".")+1).toLowerCase();
				
				if(exts.containsKey(ext)) {
					dst = exts.get(ext);
				}
				
				try {
					new File("dst/"+dst).mkdirs();
					
					
					Files.copy(
						file.toPath(), 
						new FileOutputStream("dst/"+dst+"/"+file.getName())
						);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	HashMap<String, String> exts;
	
	void setExts(String arr, String vv) {
		for (String ext: arr.split(",")) {
			exts.put(ext, vv);
		}
	}
	
	public FileDisMain() {
		exts = new HashMap();
		setExts("bmp,jpg,gif,png,jpeg","이미지");
		setExts("mp3,wma,wav","음악");
		setExts("doc,hwp,ppt,xls,pptx,xlsx,docx,txt","문서");
		
		dirGo(new File("ori"));
	}

	public static void main(String[] args) {
		
		new FileDisMain();
	}

}
