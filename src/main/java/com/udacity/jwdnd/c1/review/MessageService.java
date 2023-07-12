package com.udacity.jwdnd.c1.review;

//import org.apache.logging.log4j.message.Message;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {

    private String message;

    private List<ChatMessage> chatMessages;



    public MessageService(String message){
        this.message = message;
    }

    public String lowercase(){
        return this.message.toLowerCase();
    }

    public String uppercase(){
        return this.message.toUpperCase();
    }

    public void addChatMessage(ChatForm chatForm){
        ChatMessage chatMessage = new ChatMessage();
        System.out.println(chatForm.getMessageType());
        chatMessage.setUsername(chatForm.getUsername());
        switch (chatForm.getMessageType()){
            case "Say":
                chatMessage.setMessage(chatForm.getTextMessage());
                break;
            case "Shout":
                chatMessage.setMessage(chatForm.getTextMessage().toUpperCase());
                break;
            case "Whisper":
                chatMessage.setMessage(chatForm.getTextMessage().toLowerCase());
                break;
        }
        this.chatMessages.add(chatMessage);
    }

    public List<ChatMessage> getChatMessageList(){
        return this.chatMessages;
    }

    @PostConstruct
    public void postConstruct(){
        this.chatMessages = new ArrayList<>();
        System.out.println("Creating Message Service Bean..");
    }
}
