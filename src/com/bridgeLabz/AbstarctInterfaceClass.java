package com.bridgeLabz;
interface Child{
    void eat();
    void Shout();
    void Play();
}
abstract class Frnd implements Child{
    public void eat() {
        System.out.println("Eating");
    }


}

class FrndOfFrnd extends Frnd{
    public void Play() {
        System.out.println("Playing");
    }

    @Override
    public void Shout() {
        System.out.println("Shouting");
    }
}
public class AbstarctInterfaceClass {
    public static void main(String[] args) {
        FrndOfFrnd obj = new FrndOfFrnd();
        obj.eat();
        obj.Shout();
        obj.Play();
    }
}
