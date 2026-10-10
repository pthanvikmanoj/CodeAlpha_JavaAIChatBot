package com.javaai.botservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.javaai.botaiservice.FaqService;
import com.javaai.botmodel.Faq;

@Service
public class NlpService {

    private final FaqService faqservice;

    public NlpService(FaqService faqservice) {
        this.faqservice = faqservice;
    }

    public String findAnswer(String userMessage) {

        if (userMessage == null || userMessage.trim().isEmpty()) {
            return "Please enter a question.";
        }

        String input = userMessage.toLowerCase()
                .replaceAll("[^a-zA-Z0-9 ]", " ")
                .trim();

        // Greeting responses
        if (input.equals("hi") ||
            input.equals("hii") ||
            input.equals("hello") ||
            input.equals("hey") ||
            input.equals("hi there") ||
            input.equals("hello there")) {

            return "Hello! How can I help you?";
        }

        // Get FAQs from MySQL database
        List<Faq> faqs = faqservice.findAll();

        // Match user question with FAQ keywords
        for (Faq faq : faqs) {

            if (faq.getkeywords() == null) {
                continue;
            }

            String[] keywords = faq.getkeywords()
                    .toLowerCase()
                    .split(",");

            for (String keyword : keywords) {

                String cleanKeyword = keyword.trim();

                if (!cleanKeyword.isEmpty()
                        && input.contains(cleanKeyword)) {

                    return faq.getanswer();
                }
            }
        }

        // Default response
        return "Sorry, I don't know the answer yet. "
                + "Please ask a question related to my FAQs.";
    }
}