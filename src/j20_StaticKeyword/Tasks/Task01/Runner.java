package j20_StaticKeyword.Tasks.Task01;

public class Runner {
     /*
     Task 01 >
     fields: width, length ve cevre ve alan hesaplayan methodolan
     Rectangle isminde Class create ediniz.
     Runeer class'da obj ile cevre ve alan değelerini print eden code
     create ediniz.
    */


    public static void main(String[] args) {
        Rectangle dikdörtgen= new Rectangle();
        dikdörtgen.width=10;
        dikdörtgen.length=5;
        System.out.println("dikdörtgen.cevre() = " + dikdörtgen.cevre());
        System.out.println("dikdörtgen.alan() = " + dikdörtgen.alan());

    }
}
