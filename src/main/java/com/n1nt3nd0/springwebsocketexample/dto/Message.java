package com.n1nt3nd0.springwebsocketexample.dto;



public class Message {
    private String from;
    private String text;

    public Message(String from, String text) {
        this.from = from;
        this.text = text;
    }

    public Message() {
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
