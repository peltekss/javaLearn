package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C05_NestedTernaryOperator {

    public static void main(String[] args) {

        /*
        TASK:
        Girilen sayı 0 dan büyük eşit ise 10 dan küçüklüğünü kontrol ediniz.
        10 dan küçük ise "Rakam" değilse "Pozitif Sayı",
        Sayı 0 dan küçük ise "Negatif sayı" print eden code create ediniz.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();
        System.out.println(sayi>=0?(sayi<10?"Rakam":"Pozitif sayi"): "Negatif sayi");


    }
}
