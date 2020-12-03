package com.example.demo.entity;

public class Msg {
    public static final int TYPE_RECEIVED = 0;
    public static final int TYPE_SEND = 1;

    private int type;
    private String content;

    public int getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public Msg(String content, int type) {
        this.type = type;
        this.content = content;
    }
}
