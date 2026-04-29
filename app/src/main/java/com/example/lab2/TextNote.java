package com.example.lab2;

public class TextNote extends Note{
    protected String content;

    public TextNote() {
        super(title, content);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getContent() {
        return content;
    }

    void setContent(String content) {
        this.content = content;
    }
    public String display() {
        System.out.println("Text Note: " + getTitle());
        System.out.println("Content: " + content);
        return "";
    }
}

