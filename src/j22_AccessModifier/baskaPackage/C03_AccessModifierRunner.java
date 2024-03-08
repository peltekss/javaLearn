package j22_AccessModifier.baskaPackage;

import j22_AccessModifier.C01_AccessModifier;

public class C03_AccessModifierRunner {
    private String privateName = "Safvet Bey";
    protected String protectedName = "Halit Bey";
    String deaultName = "Sema Hanım";
    public String publicName = "Saim Bey";

    public static void main(String[] args) {
        //C01_AccessModifier obj1= new C01_AccessModifier();//p'siz const old için call edilemedi.
        C01_AccessModifier obj1 = new C01_AccessModifier(33, 40);//p'li const olduğu için başka bir classtan call edilerek obj create edildi.
        System.out.println("obj1.publicYas = " + obj1.publicYas);//farklı packagetan sadece public variable call edilebildi.
        //obj1.protectedYas -> farklı packageden public olmayan parent-chil olmayan protected variable call edilemez:CTE
        //obj1.defaultYas-> farklı packageden public olmayan deafult variable call edilemez:CTE
        //obj1.privateYas-> farklı packageden public olmayan private variable call edilemez:CTE
        C03_AccessModifierRunner obj2 = new C03_AccessModifierRunner();//kendi classından obj olduğu için tüm member'lara obj ile ulaşabildi.
        System.out.println("obj2.privateName = " + obj2.privateName);//kendi classından obj olduğu için tüm member'lara obj ile ulaşabildi.
        System.out.println("obj2.deaultName = " + obj2.deaultName);//kendi classından obj olduğu için tüm member'lara obj ile ulaşabildi.
        System.out.println("obj2.protectedName = " + obj2.protectedName);//kendi classından obj olduğu için tüm member'lara obj ile ulaşabildi.
        System.out.println("obj2.publicName = " + obj2.publicName);//kendi classından obj olduğu için tüm member'lara obj ile ulaşabildi.

        //C01_AccessModifier.privateMeth();//static ama className  ile call edilemeyen private meth
        //C01_AccessModifier.defaultMeth();//farklı packagedan old. için static ama className ile call edilemeyen private meth

    }
}
