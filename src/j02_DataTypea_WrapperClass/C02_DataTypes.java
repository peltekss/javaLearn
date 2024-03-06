package j02_DataTypea_WrapperClass;

public class C02_DataTypes {//class level
    /*
             Java'da  2 farkli data type tanımlanır.
             1)Primitive Data Type (8 tane)
               a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar
               b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
                    her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
                    char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.
               c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
                    byte variable -> memory'de 8 bitlik alan kaplar.
               d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
                    short variable -> memory'de 16 bıt alan kaplar.
               e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
                    int variable -> memory'de 32 bit alan kaplar.
               f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
                    long variable -> memory'de 64 bit alan kaplar.
               g)float : ondalikli sayilar icin kullanilır.
                    float variable -> memory'de 32 bit kullanir.
                    float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
                    0.1234567
                    Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.
               h)double : ondalikli sayilar icin kullanılır.
                    double variable -> memory'de 64 bit kullanir.
                    double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
                    0.1234567890123456
             2)Non-Primitive Data Type
                String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
             */
            /*
        1)Java'da iki turlu "memory" vardır.
            i)Stack Memory: -> gömlek cebi
                a)Kucuk memory'dir
                b)Primitve ve Non-Primitive'lerin adreslerini(Reference) icerir
           ii)Heap Memory: -> cüzdan
                a)Buyuk Memory'dir
                b)Non-Primitive'leri icerir
        2)Java Heap Memory'ye yerlestirilen her non-primitve data icin bir address(Reference) olusturur ve bu adresi(Reference)
         Stack Memory'yde depolanır. Herhangi bir sebeple address(Reference) silinirse Java adresi(Reference) olmayan Heap deki
         non-primitive data yi otomatik siler.  Memory'nin temizligini saglayan "Garbage Collector" çalışır.
     */
        /*
        PRIMITIVE DATA TYPE - NON-PRIMITIVE  DATA TYPE  FARKLARI...
        1)primitive'de tum harfler kucuk; non-primitive'de ilk harf buyuk kullanılır.
        2)primitive data typelarini Java olusturmustur, biz primitive data typelarini olusturamayiz.
        ama non-primitive data type larini Java programcilari tarafindan istenildigi kadar olusturulabilir.
        3)primitive data typelarin memoryde kapladigi yer degisirken; non-primitivelerin memoryde kapladigi yer hep aynidir
        4)primitive data typelarinin memoryde ayirdigi alanda sadece o primitive datanin degeri vardir.
        non-primitive'lerde ise degeri ve methodlari vardir.
        5)primitive 'ler renklenirken mavi renklenirken ; non-primitiveler renklenmez.Or: String siyah kalir
     */
    public static void main(String[] args) {//main level
        //hap bilgi-> bir variable'a değer ataması yapılırken data type'a uygun değer veya value atanmalı. Aksi takdirde CTE hatası alınır.

        String isim = "Can Yücel";
        String unvan = "Team Lead";
        // String sene=11; CTE data type ve value uygun değil.
       double maaş = 40000;
       // double maas1 = "40000"; // CTE
        //int yas=false; CTE
        boolean acemi = true;
       // boolean emekli = "false"; CTE
        char ch1 = 'A';
        char ch2 = '&';
        //char ch3 = ''; CTE -> char değeri boş olamaz -> karaktersiz olmaz
        char ch4 = ' ';
        //char ch5 = ' a'; //CTE -> birden çok karakter olmaz.

        // Task-> 1999 yılında doğan kisinin yasını print eden code create ediniz...

        int yıl = 1999;
        int yıl1 = 2024;

        int yas = yıl1-yıl;

        System.out.println("yas = " + yas);

        //Task -> iki farklı tamsayı türünde sayı  tanımlayıp toplam farkını print ediniz.

        int sayı1 = 10;
        short sayı2 = 20;

        int toplam = sayı1+sayı2;
        int fark = sayı2-sayı1;

        System.out.println("toplam = " + toplam);
        System.out.println("fark = " + fark);

        //Task -> tamsayı ve ondalıklı sayı tanımlayıp toplam  print ediniz

        int a = 5;
        float b = 5.7f;

        System.out.println("toplam = " + (a+b));

        //Task -> tamsayı ve char data type iki variable  tanımlayıp toplam  print ediniz

        char Ali = 'a';
        int number = 80;

        System.out.println("toplam = " + (Ali+number));

        // Task -> ad ve soyadınızı ve yasınızı print ediniz.

        String ad = "Saliha";
        String soyisim = "Ayaz";
        int yas1 = 25;
        System.out.println(ad + " " + soyisim + " " + yas1);


    }//main sonu

}//clas sonu
