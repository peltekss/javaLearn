package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    public static void main(String[] args) {
        /*
        TASK:
        Girilen bir pozitif tamsayı 4 basamaklı ise "4 Basamaklı"
        değilse çift olup olmadığını kontrol edip. Çift ise "4 basamaklı olmayan çift say"
        değilse "4 basamaklı olmayan tek say" print eden code create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir tamsayı giriniz: ");
        int sayi = Math.abs(scan.nextInt());//abs mutlak değer alma metodu.
        System.out.println(sayi > 999 && sayi < 10000 ? sayi + " sayisi 4 basamaklı" :
                sayi % 2 == 0 ? sayi + " sayisi 4 basamaklı olmayan çift say" : sayi + " sayisi 4 basamaklı olmayan tek say");



    }
}
