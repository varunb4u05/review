package com.udacity.jwdnd.c1.review;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ChatController {

    private MessageService messageService;

    public ChatController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/chat")
    public String getMessages(@ModelAttribute("chatForm") ChatForm chatForm,
                              Model model){
        model.addAttribute("messages", messageService.getChatMessageList());
        return "chat";
    }

    @PostMapping("/chat")
    public String receiveChatMessage(@ModelAttribute("chatForm") ChatForm chatForm,
                                     Model model){
    messageService.addChatMessage(chatForm);
    model.addAttribute("messages", messageService.getChatMessageList());
        return "chat";
    }

    @ModelAttribute("allMessageTypes")
    public String[] getAllMessageTypes(){
        return new String[] {"Say", "Shout", "Whisper"};
    }
}
