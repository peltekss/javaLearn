package j07_StringManipulation;

import java.util.Scanner;

public class C10_IndexOf_LastIndexOf {
    public static void main(String[] args) {
        /* indexOf()->aranan yolcunun koltuk numarasını verir
        char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
        Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
        contains den farkı indexini verir, contains ise true false
        */
        String str = "madem geldin dünyaya çalıs Java'ya";
        System.out.println("str.indexOf('y') = " + str.indexOf('y'));//y karakterinin str daki indexini return eder.
        System.out.println("str.indexOf(\"e\") = " + str.indexOf("e"));//e nin ilk görünğü yerin indexini return eder.
        //metinden bir kelimenin indexi arandığı zaman kelimeyi ilk bulduğu yerin indexini return eder.
        System.out.println("str.indexOf(\"JAVA\") = " + str.indexOf("JAVA"));
        System.out.println("str.indexOf(\"Java\") = " + str.indexOf("Java"));
        //hap bilgi -> indexOf methodu olmayan bir Char veya string arandığı zaman CTE veya RTE hatası vermez -1 return eder.
        System.out.println("str.indexOf(\"a\",12) = " + str.indexOf("a", 12));

        /* lastIndexOf()
        String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
        indexOf un sondan olan hali fakat index numaraları değişmez.
        lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
        indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
        */

        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));
        System.out.println("str.lastIndexOf('x') = " + str.lastIndexOf('x'));
        System.out.println("str.lastIndexOf('s') = " + str.lastIndexOf('s'));
        System.out.println("str.length() = " + str.length());

         /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
        a-) girilen ifade java içermiyor
        b-) girilen ifade 1 adet java içeriyor
        c-) girilen ifade  1'den çok java içeriyor
          */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scan.nextLine().toLowerCase();
        //if (metin.indexOf("java")==-1) {}
        if (!metin.contains("java")) {
            System.out.println("Girilen metin java içermiyor.");

        } else if (metin.indexOf("java") == metin.lastIndexOf("java")) {
            System.out.println("Girilen metinde java bir defa kullanılmıştır.");

        } else System.out.println("Girilen ifade 1 den fazla java içeriyor.");


    }
}
