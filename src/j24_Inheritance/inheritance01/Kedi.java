package j24_Inheritance.inheritance01;

import j24_Inheritance.inheritance01.Memeliler;

public class Kedi extends Memeliler {
    public Kedi() {
        System.out.println("Paramateresiz kedi const call edildi.");
    }
    public void tırmalama(){
        System.out.println("Kediler kızarsa tırmalar.");
    }
}
