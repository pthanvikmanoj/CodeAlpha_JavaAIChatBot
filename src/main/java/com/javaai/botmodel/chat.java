package com.javaai.botmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class chat {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id; // user contains a id example: id = 1
    
	@JsonProperty("usermessage")
	private String usermessage; // for user message or any question
	@JsonProperty("botresponse")
	private String botresponse; // for response for the user input messages

	public chat() {

	}

	public chat(String usermessage, String botresponse) {
		this.usermessage = usermessage;  // constructors for the bot and user messages
		this.botresponse = botresponse;
	}

	public Long getId() {                //get method for the user id
		return id;
	}
	public void setId(Long id) {				//set method for the id
		this.id = id;
	}

	public String getusermessage() {     //get method for the user message
		return usermessage;
	}

	public void setusermessage(String usermessage) {        //set method for the user message
		this.usermessage = usermessage;
	}

	public String getbotresponse() {      //get method for the bot response
		return botresponse;
	}

	public void setbotresponse(String botresponse) {        //set method for the bot response
		this.botresponse = botresponse;
	}

}
