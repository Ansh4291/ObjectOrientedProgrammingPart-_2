package com.bridgeLabz;

public class PassByRefrence {
    int a = 10;
    void call (PassByRefrence eg) {
        eg.a = eg.a+10;
    }

    public static void main(String[] args) {
        PassByRefrence eg = new PassByRefrence();
        System.out.println("before pass by Refrence:- " + eg.a);
        eg.call(eg);
        System.out.println("After pass by Refrence :- " + eg.a);
    }
}
