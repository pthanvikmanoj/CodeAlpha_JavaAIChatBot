package com.javaai.botcontroller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.javaai.botaiservice.FaqService;
import com.javaai.botmodel.Faq;

@RestController
@RequestMapping("/Faq")
public class FaqControlller {

	private final FaqService faqservice;
	
	public FaqControlller(FaqService faqservice) {
		this.faqservice = faqservice;
	}
	
	@PostMapping
	public Faq savefaq(@RequestBody Faq faq) {
		return faqservice.save(faq);
	}
	
	@GetMapping
	public List<Faq>findAll(){
		return faqservice.findAll();
	}
	
	
}
