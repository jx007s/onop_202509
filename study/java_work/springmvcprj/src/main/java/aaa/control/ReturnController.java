package aaa.control;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.JsonObject;

import aaa.mmm.Address;
import aaa.mmm.BuyOrder;
import aaa.mmm.Person;
import aaa.mmm.Product;
import aaa.mmm.Stud;

@Controller
@RequestMapping("/ret")
public class ReturnController {

	@RequestMapping("vv")
	String vv(Model mm) {
		mm.addAttribute("pname", "장동건");
		return "/ret/vv";
	}
	
	@RequestMapping("moAndvv")
	ModelAndView moAndvv() {
		
		ModelAndView mav = new ModelAndView("/ret/vv"); // "/ret/vv" ::  view page
		mav.addObject("pname", "장서건");	// request.attribute
		return mav;
	}
	
	// ret/pp1,    ret/pp2   둘다 맵핑
	@RequestMapping(path = {"pp1", "pp2"})
	String even(Model mm) {
		mm.addAttribute("pname", "장남건");
		return "/ret/vv";
	}
	
	
	@RequestMapping("vv2")
	String vv2() {
		return "아기상어";  // view 페이지로 이동하여 에러발생
	}
	
	@ResponseBody   // view 페이지로 forwarding 하지 않고 리턴값을 화면에 출력
	@RequestMapping("vv3")
	String vv3() {
		return "엄마상어";  //화면에 출력
	}
	
	@ResponseBody  
	@RequestMapping("per")
	Object per() {
		Person res = new Person();
		res.setPname("한가인");
		res.setAge(41);
		res.setMarriage(true);
		return res;  //json 으로 출력 - {"age":41,"marriage":true,"pname":"한가인"}
	}
	
	@ResponseBody  
	@RequestMapping("arr")
	Object arr() {
		
		return new int[] {11,22,33,44}; // [11,22,33,44]
	}
	
	@ResponseBody  
	@RequestMapping("map")
	Object mapp() {
		
		LinkedHashMap res = new LinkedHashMap();
		res.put("사자", "포유류");
		res.put(100, new String[] {"문어","고래","거북이"});
		
		Stud st = new Stud();
		st.setPname("이광재");
		st.setKor(98);
		st.setEng(92);
		st.setMat(81);
		
		res.put("abcd", st);
		
		return res;
		//{"사자":"포유류","100":["문어","고래","거북이"],"abcd":{"avg":90,"eng":92,"kor":98,"mat":81,"pname":"이광재","tot":271}}
	}
	
	
	@ResponseBody  
	@RequestMapping("obj1")
	Object obj1() {
		BuyOrder res = new BuyOrder();

		res.setAd( new Address("12345","경남창원시구구구동동동","테크노파크707"));
		
		List<Product> list = new ArrayList<>();
		list.add(new Product("텀블러",2000,5));
		list.add(new Product("마우스",12000,3));
		list.add(new Product("키보드",50000,2));
		list.add(new Product("모니터",300000,1));
		res.setProds(list);
		
		
		return res;  
		
		//{"ad":{"addr1":"경남창원시구구구동동동","addr2":"테크노파크707","zipcode":"12345"},"prods":[{"cnt":5,"pname":"텀블러","price":2000,"tot":10000},{"cnt":3,"pname":"마우스","price":12000,"tot":36000},{"cnt":2,"pname":"키보드","price":50000,"tot":100000},{"cnt":1,"pname":"모니터","price":300000,"tot":300000}],"tot":0}
		
	}
	
	
	@ResponseBody  
	@RequestMapping("obj2")
	String obj2() {
				
		JsonObject res = new JsonObject();//JSon 객체 생성후 String으로 리턴
		
		res.addProperty("title", "제목이야");
		res.addProperty("cnt", 123);
		res.addProperty("vv", true);
		res.addProperty("content", "내용이지");
		
		
		return res.toString();  
		//{"title":"제목이야","cnt":123,"vv":true,"content":"내용이지"}
		
	}
	
	
}
