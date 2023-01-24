package com.example.demoapplication.data;

public class Contact {
    private String name="";
    private String mobile_no="";
    private int image;

    public Contact(String name, String mobile_no, int image) {
        this.name = name;
        this.mobile_no = mobile_no;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile_no() {
        return mobile_no;
    }

    public void setMobile_no(String mobile_no) {
        this.mobile_no = mobile_no;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
