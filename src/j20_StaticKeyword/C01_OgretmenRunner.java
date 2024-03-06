package j20_StaticKeyword;

public class C01_OgretmenRunner {
    public static void main(String[] args) {
        C01_Ogretmen t1= new C01_Ogretmen("Sema",11);
        System.out.println("t1.isim = " + t1.isim);//obj. ile instance varable call edildi.->Sema
        System.out.println("t1.tecrube = " + t1.tecrube);//obj. ile instance varable call edildi.->11
        t1.evlilikTebrikEt();//obj ile non static meth. call edildi.->Başka bir derdin mi yoktu arkadaşım?
        t1.maasHesapla();//obj ile static meth call edildi.->bad practice->Maasin hayırlı olsun ilk maasın ile ne ısmarlıyorsun
        C01_Ogretmen.maasHesapla();//Class name ile Static meth call edildi.->Maasin hayırlı olsun ilk maasın ile ne ısmarlıyorsun
        System.out.println("C01_Ogretmen.okulİsmi = " + C01_Ogretmen.okulİsmi);//Classname ile static variable call edildi.->Sivas Lisesi
        C01_Ogretmen.okulİsmi="Sivas Anadolu Lisei";//Classname ile static variable update edildi.->Sivas Lisesi
        System.out.println("t1.okulİsmi = " + t1.okulİsmi);//obj ile static variable call edildi->Sivas Anadolu Lisei
        System.out.println("C01_Ogretmen.okulİsmi = " + C01_Ogretmen.okulİsmi);//Classname ile static variable call edildi->Sivas Anadolu Lisei
        C01_Ogretmen t2=new C01_Ogretmen("Merve",13);
        System.out.println("t2.tecrube = " + t2.tecrube);//13
        System.out.println("t2.isim = " + t2.isim);//Merve
        System.out.println("t2.okulİsmi = " + t2.okulİsmi);//Sivas Anadolu Lisesi
        C01_Ogretmen t3 = new C01_Ogretmen();
        System.out.println("t3.isim = " + t3.isim);
        System.out.println("t3.tecrube = " + t3.tecrube);
        System.out.println("t3.okulİsmi = " + t3.okulİsmi);
    }
}
