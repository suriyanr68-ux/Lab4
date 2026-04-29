package com.example.lab2;
import java.util.ArrayList;
import java.util.List;

public class Checklist extends Note {
    private List<String> item;
    private List<Boolean> status;

    public Checklist(){
        super(title, content);
        this.item = new ArrayList<>();
        this.status = new ArrayList<>();
    }

    public List<String> getItem() {
        return item;
    }

    public List<Boolean> getStatus() {
        return status;
    }
    public void addItem(String item) throws InterruptedException {
        item.wait(Long.parseLong(item));
        status.add(false);
    }
}