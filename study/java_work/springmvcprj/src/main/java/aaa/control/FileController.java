package aaa.control;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import aaa.mmm.FileData;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/file")
public class FileController {

	@GetMapping
	String form() {
		
		return "file/form";
	}
	
	@PostMapping("reg1")
	String reg1(Model mm,  
			@ModelAttribute("pname") String pname, 
			@RequestParam("age") int age, 
			@RequestParam("ff1") MultipartFile [] ff1,
			@RequestParam("ff2") MultipartFile ff2,
			HttpServletRequest request) {
		
		System.out.println("reg1 : "+pname+","+age+","+ff1+","+ff2);
		
		
		
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
		
		if(!ff2.isEmpty()) {
			fileSave(ff2,request);
			mm.addAttribute("ff2", ff2.getOriginalFilename());
		}
		mm.addAttribute("age", age);
		
		return "file/reg1";
	}
	
	
	@PostMapping("reg2")
	String reg2(Model mm,  
			MultipartHttpServletRequest mr,
			HttpServletRequest request) {
		
		System.out.println("reg2 : "+mr.getParameter("pname")+","+mr.getParameter("age"));
		
		List<MultipartFile> ff1 = mr.getFiles("ff1");
		MultipartFile ff2 = mr.getFile("ff2");
		
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
		
		if(!ff2.isEmpty()) {
			fileSave(ff2,request);
			mm.addAttribute("ff2", ff2.getOriginalFilename());
		}
		
		mm.addAttribute("pname", mr.getParameter("pname"));
		mm.addAttribute("age", mr.getParameter("age"));
		
		return "file/reg1";
	}
	
	
	@PostMapping("reg3")
	String reg3(FileData fd, HttpServletRequest request) {
		System.out.println("reg3 : "+fd);
		fd.ppp();
		
		if(!fd.getFf2().isEmpty()) {
			fileSave(fd.getFf2(),request);
		}
		
		return "file/reg3";
	}
	
	
	
	void fileSave(MultipartFile mf, HttpServletRequest request) {
		String path = request.getServletContext().getRealPath("/fff");
		path = "D:\\public\\onop\\2025_09\\public\\study\\java_work\\springmvcprj\\src\\main\\webapp\\fff";
		
		File saveFile = new File(path, mf.getOriginalFilename());
		try {
			mf.transferTo(saveFile);  // 파일 저장
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
