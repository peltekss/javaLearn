package j20_StaticKeyword;

public class C02_StaticBlok {
    /*
   1.static blok yapıları static variable'rı değer ataması update için kullanılır
   2.static blok Class oluşturulduğunda butun method'lardan(Deneme method dahil) önce çalışır
   3.birden fazla static blok varsa yukarıdan aşagiya sıralama ile çalışır.
   4.static bloklar sadece 1 kere en basta calisir static olmayan bloklar her obje olusturulurken yeniden calisir
    */

    static String isim = "JavaNur";//initial edilmiş static variable oluşturuldu.

    static {//ilk run edilecek static blok
        System.out.println("*** 2. static blok run edildi");
        System.out.println("2.blok update öncesi isim: " + isim);
        isim = "JavaTar";
        System.out.println("2.blok update sonrası isim: " + isim);
    }

    public static void main(String[] args) {//Deneme level
        System.out.println("***Deneme meth run edilmeye başladı***");
        System.out.println("Deneme meth. update öncesi isim: " + isim);
        isim = "JavaMain";
        System.out.println("***Deneme meth. run bitti*** " + isim);
    }//Deneme sonu

    static {//ikiinci run edilecek static blok
        System.out.println("*** 1. static blok run edildi");
        System.out.println("1.blok update öncesi isim: " + isim);
        isim = "JavaHan";
        System.out.println("1.blok update sonrası isim: " + isim);
    }
}
