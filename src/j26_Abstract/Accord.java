package j26_Abstract;

public class Accord extends Honda{//concrete child class
    @Override
    public void motor() {
        System.out.println("2.0 motor cok kacar");
    }

    @Override
    void koltuk() {
        System.out.println("Deri koltuk pek lux olmus");
    }

    @Override
    void kapi() {
        System.out.println("4 kapili arabalar guzel duruyor");
    }

    @Override
    void sunroof() {
        System.out.println("Sigara yakmak icin sunroof taktirdin degil mi?");
    }
}
