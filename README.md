# Java AI FAQ Chatbot

## About the Project
This is a rule-based FAQ chatbot developed using Java,
Spring Boot, and MySQL. It answers user questions by
matching keywords with predefined FAQs stored in a database.

## Technologies Used
- Java
- Spring Boot
- MySQL
- Spring Data JPA
- HTML
- CSS
- JavaScript

## Features
- Answers frequently asked questions
- Keyword-based answer matching
- Greeting responses
- Stores chat history in MySQL
- Provides a default response for unknown questions
- Web-based user interface

## How It Works
1. The user enters a message.
2. The chatbot checks the message against FAQ keywords.
3. If a keyword matches, the corresponding answer is returned.
4. If no match is found, a default response is displayed.
5. Chat history is stored in MySQL.

## How to Run
1. Clone or download this repository.
2. Import the project into Eclipse as a Maven project.
3. Configure your MySQL database.
4. Run BotApplication.java.
5. Open http://localhost:8080 in your browser.

## Learning Outcomes
- Java and Spring Boot development
- REST API development
- MySQL database integration
- Rule-based chatbot implementation
- Basic NLP keyword matching