package com.example.lab43;

public class Contact {
    private String avatar;
    private  String name;
    private  String phone;

    public Contact( String name, String phone,String avatar) {
        this.avatar = avatar;
        this.name = name;
        this.phone = phone;
    }

    public String getAvatar() {
        return avatar;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
