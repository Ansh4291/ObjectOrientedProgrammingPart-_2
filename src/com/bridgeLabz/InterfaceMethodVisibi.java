package com.bridgeLabz;
interface Bicycle{
    int a =45;
    void speedup(int increment);
    void Brakup(int decrement);
}

class Avon implements Bicycle{


    public void speedup(int increment) {
        System.out.println("Bicycle speed up 45 km/h ");

    }


    public void Brakup(int decrement) {

        System.out.println("Applying brakup");
    }

}
public class InterfaceMethodVisibi {
    public static void main(String[] args) {
        Avon ab = new Avon();
        ab.speedup(0);
        ab.Brakup(0);
    }
}
