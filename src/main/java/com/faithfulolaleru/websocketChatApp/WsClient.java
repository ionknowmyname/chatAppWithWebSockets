package com.faithfulolaleru.websocketChatApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.stomp.StompSession;
import org.springframework.messaging.simp.stomp.StompSessionHandler;
import org.springframework.web.socket.messaging.WebSocketStompClient;

public class WsClient {

    @Autowired
    private WebSocketStompClient stompClient;


    /*StompSessionHandler sessionHandler = new CustomStompSessionHandler();

    StompSession stompSession = stompClient.connect(loggerServerQueueUrl,
            sessionHandler).get();*/
}
