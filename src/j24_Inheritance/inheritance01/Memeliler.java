package j24_Inheritance.inheritance01;

public class Memeliler extends Hayvanlar {
    public Memeliler() {
        System.out.println("Parametresiz memeliler const edildi.");
    }
    public void sutBeslen(){
        System.out.println("Bebeklerini sütle beslerler");
    }
    public void doğum(){
        System.out.println("Nur topu gibi yavrusu olur.");
    }
}
