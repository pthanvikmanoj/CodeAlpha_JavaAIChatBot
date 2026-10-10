package com.javaai.botrepository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javaai.botmodel.chat;

public interface ChatRepository extends JpaRepository<chat,Long> {

	/* for the following instructions
	Save Chat
	Find Chat
	Find All Chats
	Delete Chat
	Update Chat in the Repository
      */
	
}
