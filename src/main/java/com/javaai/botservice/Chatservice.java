package com.javaai.botservice;

import org.springframework.stereotype.Service;
import com.javaai.botmodel.chat;
import com.javaai.botrepository.ChatRepository;
import java.util.List;

@Service
public class Chatservice {
    
	private final ChatRepository chatrepository;
	
	public Chatservice(ChatRepository chatrepository) {
		this.chatrepository = chatrepository;
	}
	
	 public chat save(chat chat ) {
		 return chatrepository.save(chat);
	 }
	 
	 public List<chat>findAll(){                             //To Find Whole Chat 
		 return chatrepository.findAll();
		 }
	   
	 public chat findById(Long id) {                         //To Find the Chat user by id    
		 return chatrepository.findById(id).orElse(null);      
	 }
	 
	 public void deleteById(Long id) {						 //To Delete the Chat
		  chatrepository.deleteById(id);
	 }
	 
	 public chat update(chat chat) {						  // To Update the Chat 
		 return chatrepository.save(chat);
	 }
	 
}
