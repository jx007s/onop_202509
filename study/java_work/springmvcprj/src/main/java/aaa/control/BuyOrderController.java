package aaa.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import aaa.mmm.BuyOrder;

@Controller
@RequestMapping("/req/buyOrder")
public class BuyOrderController {

	@GetMapping
	String form() {
		return "req/buyOrderForm";
	}
	
	@PostMapping
	String complete(@ModelAttribute("bo") BuyOrder bo) {
		// 제품명이 없으면 제품목록에서 제외
		bo.calc();
		System.out.println("complete : "+bo);
		return "req/buyOrderReg";
	}
}
