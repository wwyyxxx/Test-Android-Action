package com.example.dele.test;

public class Family {
    private String name;
    private int imageID;
    private String phoneNum;

    public Family(String name, int imageID, String phoneNum){
        this.name = name;
        this.imageID = imageID;
        this.phoneNum = phoneNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }
}
