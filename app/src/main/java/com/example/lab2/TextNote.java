package com.example.lab2;

public class TextNote extends Note{
    public TextNote() {
        super();
    }
    public TextNote(String title, String content) {
        super(title, content);
    }

    public String display() {
        System.out.println("Text Note: " + getTitle());
        System.out.println("Content: " + content);
        return "";
    }
}

