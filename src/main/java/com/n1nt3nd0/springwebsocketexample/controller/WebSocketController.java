package com.n1nt3nd0.springwebsocketexample.controller;

import com.n1nt3nd0.springwebsocketexample.dto.Message;
import com.n1nt3nd0.springwebsocketexample.dto.OutputMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@CrossOrigin(origins = "*")
public class WebSocketController {
    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(@Payload Message message) throws Exception {
        System.out.println("Received new message: " + message.toString());
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }


}
