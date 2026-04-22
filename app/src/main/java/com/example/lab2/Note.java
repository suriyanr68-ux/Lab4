package com.example.lab2;

public class Note {
        String title;
        String content;
        String createdDate;

        void getSummary(){
            System.out.print(this.title);
            System.out.print(this.content+" "+this.createdDate);
        }

    }

