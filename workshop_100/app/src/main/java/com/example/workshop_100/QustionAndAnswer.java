package com.example.workshop_100;

public class QustionAndAnswer {

    String qustion;
    String anwer;

    public QustionAndAnswer(String qustion) {
        this.qustion = qustion;
        this.anwer ="";
    }

    public String getQustion() {
        return qustion;
    }

    public void setQustion(String qustion) {
        this.qustion = qustion;
    }

    public String getAnwer() {
        return anwer;
    }

    public void setAnwer(String anwer) {
        this.anwer = anwer;
    }
}
