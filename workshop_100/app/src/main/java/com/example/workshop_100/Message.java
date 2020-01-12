package com.example.workshop_100;

public class Message {
    private String title;
    private String main;

    private String time;

    public Message(String title, String main, String time) {
        this.title = title;
        this.main = main;
        this.time = time;
    }


    public String getTitle() {
        return title;
    }

    public String getMain() {
        return main;
    }

    public String getTime() {
        return time;
    }
}
