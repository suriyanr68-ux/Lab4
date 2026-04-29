package com.example.lab2;

public  abstract class Note {
        protected String title;
        protected String content;
        protected String createdDate;

    public Note(String title, String content) {
        this.title = title;
        this.content = content;
        this.createdDate = createdDate;
    }

    void getSummary(){
       System.out.println(this.title+" "+createdDate);
   }

    }

