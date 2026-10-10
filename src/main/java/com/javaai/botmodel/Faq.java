package com.javaai.botmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Faq {

	 
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String question;
	 private String keywords;
	 private String answer;
	 
	 public Faq(){
	 }
	 
	 public Faq(String question,String keywords,String answer) {
		 this.question = question;
		 this.keywords = keywords;
		 this.answer = answer;
	 }
	 
	 public Long getId() {                       //getter for id
		 return id;
	 }
	 
	 public void setId(Long id) {				//setter for id
		 this.id = id;
	 }
	 
	 public String getquestion() {				//getter for question
		 return question;
	 }
	 
	 public void setquestion(String question) {  //setter for question
		 this.question = question;
	 }
	 
	 public String getkeywords() {				//getter for keywords
		 return keywords;
	 }
	 
	 public void setkeywords() {  //setter for keywords
		 this.keywords = keywords;
	 }
	 
	 public String getanswer() {				//getter for answer
		 return answer;
	 }
	 
	 public void setanswer() {		//setter for answer
		 this.answer = answer;
	 }
	 
}
