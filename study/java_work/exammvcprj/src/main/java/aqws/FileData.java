package aqws;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class FileData {

	String pname;
	int age;
	
	MultipartFile [] ff1;
	MultipartFile ff2;
	
	public void ppp() {
		System.out.println("ff1--------");
		for (MultipartFile mf : ff1) {
			System.out.println(mf);
			System.out.println(mf.getName());
			System.out.println(mf.getOriginalFilename());
			System.out.println(mf.getSize());
			System.out.println(mf.getContentType());
			System.out.println(mf.isEmpty());
		}
		System.out.println("ff2--------");
		System.out.println(ff2);
		System.out.println(ff2.getName());
		System.out.println(ff2.getOriginalFilename());
		System.out.println(ff2.getSize());
		System.out.println(ff2.getContentType());
		System.out.println(ff2.isEmpty());
	}
	
}
