package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C03_TernaryOperators  {
    /*
    Ternary ile yapılan tüm actionlar if-else ile de yappılır.
    Ternary block code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir.
    Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'laar bulunur.
     */
    public static void main(String[] args) {
    // Tas01 -> Girilen bir tamsayının tek-çift olmasını kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("*** if ile çözümü ***");
        if (sayi1%2==0){
            System.out.println(sayi1 + " sayisi çift");
        }else {
            System.out.println(sayi1 + "sayisi tek");
        }

        System.out.println("*** Ternary ile çözümü ***");
//       condition(şart) ? (if-else) şart True için ACTİON -> if body : (else değilse) şart false için  ACTİON -> else body
//       String sonuc = sayi1 % 2 == 0? sayi1 + " sayisi çift)" : sayi1 + "sayisi tek"
//       System.out.println(sonuc);
        System.out.println(sayi1 % 2 == 0? sayi1 + " sayisi çift" : sayi1 + "sayisi tek");

        // Task 02-> Girilen bir tamsayının pozitif olmasını kontrol eden code create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi2 = scanner.nextInt();
        System.out.println(sayi2<0?"Negatif" : "Pozitif");

        /*
        Ternary operator action sonucu true veya false a göre vereceği output eğer
        data type uygun bir variable (container -> kutu) a atanmazsa CTE verir.
        Çözüm olarak ternary çıktısı ya bir variable atanmalı ya da sout gibi doğrudan bir action'da kullanılmalı.

         */

        System.out.println("*** Task 03 Çözümü ***");
        //Task 03 -> Girilen iki tamsayının büyüğünü print eden code create ediniz.
        System.out.println((sayi1 > sayi2 ? sayi1 : sayi2));

        /*Task 04 -> Girilen iki tam sayının işaretleri farkllı ise toplamını değilse "devam  edebilirsiniz" print eden
        code create ediniz.
        */
        Object sonuc= sayi1*sayi2<0?sayi1+sayi2:"Devam edebilirsiniz.";
        System.out.println(sonuc);
        //Hapa Bilgi -> Ternary çıktısı farklı data typlerdan (int, String, boolean vb.) tanımlanmışsa
        // tüm data type atası olan HZ. Adem classing(Object) atanır.


    }
}
