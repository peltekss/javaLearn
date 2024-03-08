package j22_AccessModifier;

public class C02_AccessModifierRunner {
    public static void main(String[] args) {
        C01_AccessModifier obj = new C01_AccessModifier(42, 49);//p'li public vonst call edilerek obje create edildi.'
        //C01_AccessModifier obj1 = new C01_AccessModifier();//p'siz const private old için başka classtan cll edilmedi.
        System.out.println("obj = " + obj.publicYas);
        System.out.println("obj.protectedYas = " + obj.protectedYas);
        System.out.println("obj.deaultYas = " + obj.deaultYas);
        //System.out.println("obj.privateYas = " + obj.privateYas);
        C01_AccessModifier.defaultMeth();
        //C01_AccessModifier.privateMeth();//private metoda baska classtan

    }
}
