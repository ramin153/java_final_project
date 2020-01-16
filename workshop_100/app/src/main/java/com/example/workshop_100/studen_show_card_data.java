package com.example.workshop_100;

public class studen_show_card_data {
    String name;
    String lastName;
    String UserName;
    String image_url;


    public studen_show_card_data(String name, String lastName, String userName, String image_url) {
        this.name = name;
        this.lastName = lastName;
        UserName = userName;
        this.image_url = image_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}
