package aqws;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class FileController {
	
	@PostMapping("/reg3")
	String reg3(FileData fd, HttpServletRequest request) {
		System.out.println("reg3 : "+fd);
		fd.ppp();
		
		if(!fd.getFf2().isEmpty()) {
			fileSave(fd.getFf2(),request);
		}
		
		return "업로드 성공";
	}
	
	void fileSave(MultipartFile mf, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/fff");
		path = "D:\\public\\onop\\2025_09\\public\\study\\java_work\\exammvcprj\\src\\main\\webapp\\fff";
		
		File saveFile = new File(path, mf.getOriginalFilename());
		try {
			mf.transferTo(saveFile);  // 파일 저장
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
