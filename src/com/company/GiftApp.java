package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class GiftApp {

    public static void main(String[] args) {
        
        ArrayList<Gift1> mygift = new ArrayList<Gift1>();
        mygift.add(new Gift1("Jewlery", "Female", "High"));
        mygift.add(new Gift1("weekend", "Female", "High"));
        mygift.add(new Gift1("selfie stick", "Female", "Low"));
        mygift.add(new Gift1("wine", "Female", "Low"));
        mygift.add(new Gift1("perfume", "Female", "medium"));
        mygift.add(new Gift1("sweater", "Female", "medium"));
        mygift.add(new Gift1("smart TV", "Male", "High"));
        mygift.add(new Gift1("Apple watch", "Male", "High"));
        mygift.add(new Gift1("Books", "Male", "Low"));
        mygift.add(new Gift1("Shoes", "Male", "Low"));
        mygift.add(new Gift1("Guitar", "Male", "medium"));
        mygift.add(new Gift1("Playstation", "Male", "medium"));

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Gender");
        String gender = in.next();
        System.out.println("Enter price");
        String price = in.next();


        for (Gift1 zdgift: mygift){
//            System.out.println(zdgift.getGiftName() + "       " + zdgift.getGender() + "     " + zdgift.getPrice());
            if(zdgift.getGender().equalsIgnoreCase(gender) && zdgift.getPrice().equalsIgnoreCase(price)){
                System.out.println(zdgift.getGiftName());
            }
        }







        /*
        Gift Gender Price
Jewelry Female High
Weekend Getaway Female High
Selfie Stick Female Low
Wine Bottle Female Low
Perfume Female Medium
Sweater Female Medium
Smart TV Male High
Apple Watch Male High
Books Male Low
Shoes Male Low
Guitar Male Medium
Playstation Male Medium



         */

    }


}
