package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {

        // Task -> Girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi1 = scan.nextInt();
        System.out.println(sayi1<10&&sayi1>-10?sayi1+" sayisi tek basamaklı "
                : sayi1+" sayısı 2 veya daha fazla basamaklı");

    }

}
