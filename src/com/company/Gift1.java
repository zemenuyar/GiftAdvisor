package com.company;

public class Gift1 {
    private String giftName;
    private String Gender;
    private String price;

    public Gift1() {
    }

    public Gift1(String giftName, String gender, String price) {
        this.giftName = giftName;
        Gender = gender;
        this.price = price;
    }

    public String getGiftName() {
        return giftName;
    }

    public void setGiftName(String giftName) {
        this.giftName = giftName;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
