package com.javaai.botcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.javaai.botmodel.chat;
import com.javaai.botservice.Chatservice;
import com.javaai.botservice.NlpService;
import com.javaai.botaiservice.FaqService;

@RestController
@RequestMapping("/chat")
public class Chatcontroller {

    private final Chatservice chatservice;
    public final NlpService nlpservice;
    public final FaqService faqservice;

    public Chatcontroller(Chatservice chatservice,NlpService nlpservice,FaqService faqservice) {
        this.chatservice = chatservice;
        this.nlpservice = nlpservice;
        this.faqservice = faqservice;
    }

    @PostMapping
    public chat saveChat(@RequestParam String usermessage) {

        String response = nlpservice.findAnswer(usermessage);

        chat newChat = new chat(usermessage, response);

        return chatservice.save(newChat);
    }
    
    @GetMapping
    public List<chat>findAll(){
    	return chatservice.findAll();
    }
    
    @GetMapping("/{id}")
    public chat getchatId(@PathVariable Long id) {
    	return chatservice.findById(id);
    }
    
    @DeleteMapping("/{id}")
    public String deleteChat(@PathVariable Long id) { 
    	chatservice.deleteById(id);
    	return "Chat Deleted Successfully";
    }
  
    @PutMapping("/{id}")
    public chat update(@PathVariable Long id,@RequestBody chat newChat) {
    	newChat.setId(id);
    	return chatservice.update(newChat);
    }
}