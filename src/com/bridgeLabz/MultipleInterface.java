package com.bridgeLabz;
interface Wheeler2{
    void Wheel();
    void seat();
}
interface Car {
    void HandBrake();
}
class Vechile implements Wheeler2 , Car {
    public void wheel() {
        System.out.println("Wheel brand MRF TYRE ");
    }
    public void seat() {
        System.out.println("there are 4 seats are avaiable in car");
    }

    public void HandBrake() {

        System.out.println("if handbrake pull instantly car stops");
    }
    @Override
    public void Wheel() {
        // TODO Auto-generated method stub

    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        Vechile v = new Vechile();
        v.wheel();
        v.seat();
        v.HandBrake();
    }
}
