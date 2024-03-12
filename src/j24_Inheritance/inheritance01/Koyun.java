package j24_Inheritance.inheritance01;

import j24_Inheritance.inheritance01.Memeliler;

public class Koyun extends Memeliler {
    public Koyun() {
        System.out.println("Parametresiz Koyun const call edildi.");
    }
    public void meler(){
        System.out.println("Koyunlar meler.");
    }
}
