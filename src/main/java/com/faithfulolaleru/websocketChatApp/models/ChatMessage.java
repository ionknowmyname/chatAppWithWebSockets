package com.faithfulolaleru.websocketChatApp.models;

import lombok.Data;

@Data
public class ChatMessage {

    private String sender;
    private String content;
    private MessageType type;

    public enum MessageType { CHAT, JOIN, LEAVE }
}
