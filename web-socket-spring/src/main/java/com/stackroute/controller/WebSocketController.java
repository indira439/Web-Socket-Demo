package com.stackroute.controller;

import com.stackroute.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

/**
 * RestController annotation is used to create Restful web services using Spring MVC
 */
@Controller
public class WebSocketController {

    @Autowired
    private SimpMessagingTemplate template;

    /**
     * Constructor based Dependency injection to inject SimpMessagingTemplate into controller
     */
    public WebSocketController(SimpMessagingTemplate template) {
        this.template = template;
    }

    /**
     * The @MessageMapping annotation ensures that if a message is sent to destination "/message",
     * then the sendMessage() method is called.
     */
    @MessageMapping("/message")

    /**The return value is broadcast to all subscribers to "/chat/message" as specified in the SendTo*/
    @SendTo("/chat/message")

    private Message sendMessage(Message message) {
        return message;
    }
}
