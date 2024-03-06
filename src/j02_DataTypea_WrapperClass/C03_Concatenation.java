package j02_DataTypea_WrapperClass;

public class C03_Concatenation {

    /*
   Not: char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
        Ornegin; System.out.println('A' + 'CK'); ekrana AC yerine 132 print eder.
   Note: Java'da "+" sembolunun
           i)Toplama islemi
           ii)Birlestirme Islemi(Concatenation)
         Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
*/

    public static void main(String[] args) {

        String isim = "Fatih Anıl ";
        String soyisim = "Yılmaz ";

        /*
       Birden çok string variable ile farklı data btype variable'lar + ile işlem alınırsa
       java toplama değil birleştirme(Concatenation) yapar.
       Trick-> javada String güçlğü bir Class'dır.Bir + işlemi için String varsa işlem önceleğine göre
       (mürekkep) concatenation(birleştirme) yapar.
       */

        System.out.println(isim+soyisim);

        int a=17;
        int b=45;
        System.out.println(isim+soyisim+a+b);
        System.out.println(a+isim+soyisim+b);
        System.out.println(a+b+isim+soyisim);
        System.out.println(a+b);
        System.out.println(isim+soyisim+(a+b));
        System.out.println((a+b)+isim+soyisim);
        System.out.println(isim+(a-b)+(a+b));
        System.out.println(isim+((a+b)+(a-b)));
        System.out.println(""+a+b);

        char ch='1';
        System.out.println(isim+ch);
        System.out.println(a+ch+isim);
        System.out.println(isim+(ch+a));
        System.out.println(isim+ch);
        System.out.println(a+isim+ch);

        //hap bilgi -> char data type işleme alındığında variable typına göre farklı çıktı verir.
        //char int ile ascii değer üzerinden toplama yapar, string ile contact (birleştirme) yapar.

    }
}
