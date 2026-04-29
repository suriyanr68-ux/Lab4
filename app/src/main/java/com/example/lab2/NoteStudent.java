package com.example.lab2;

public class NoteStudent extends User{
    protected String content;
    public String getContent() {
        return content;
    }

    void setContent(String content) {
        this.content = content;
    }
    public String display() {
        System.out.println("Content: " + content);
        return "";
    }
}
