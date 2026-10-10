package com.javaai.botaiservice;

import org.springframework.stereotype.Service;
import java.util.List;
import com.javaai.botmodel.Faq;
import com.javaai.botrepository.FaqRepository;

@Service
public class FaqService {

	 private final FaqRepository faqrepository;
	 
	 public FaqService(FaqRepository faqrepository) {
		 this.faqrepository = faqrepository;
	 }
	 
	 public Faq save(Faq faq) {
		 return faqrepository.save(faq);
	 }
	 
	 public List<Faq>findAll(){
		 return faqrepository.findAll();
	 }
}
