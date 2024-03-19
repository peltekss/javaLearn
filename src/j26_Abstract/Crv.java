package j26_Abstract;

public class Crv extends Honda{//concrete child class
    @Override
    public void motor() {
        System.out.println("2.4 motor cok yakmaz mi");
    }

    @Override
    void koltuk() {
        System.out.println("Deri koltu yaz aylarinda terletir");
    }

    @Override
    void kapi() {
        System.out.println("Himmet abi bana 3 kapili araba alacan mi?");
    }

    @Override
    void sunroof() {
        System.out.println("Sunroof olmadan lux olmaz");
    }
}
