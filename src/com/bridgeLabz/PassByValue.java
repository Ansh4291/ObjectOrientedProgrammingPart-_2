package com.bridgeLabz;

public class PassByValue {
    int a = 10;
    void call (int a) {
        a = a+10;
    }

    public static void main(String[] args) {
        PassByValue eg = new PassByValue();
        System.out.println("before pass by value:- " + eg.a);
        eg.call(0);
        System.out.println("After pass by value :- " + eg.a);
    }
}
