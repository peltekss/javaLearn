package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
         * TASK ->
         *
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin
         *
         * VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
         *
         * Ornek : Input : boy :180 kilo : 80
         *         Output : Vucut kutle endeksiniz : 24
         *                  Vucut kutle endeksiniz : 24.691…
         *
         *
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Boyunuzu cm cinsinden giriniz. ");
        double boy = scan.nextInt();
        System.out.println("Kilonuzu kg cinsinden giriniz. ");
        double kilo = scan.nextInt();
        double vucutKutleEndeks = kilo / ((boy * boy)/10000);

        System.out.println("Vucut kutle endeksiniz : " + (int)vucutKutleEndeks);
        System.out.println("vucutKutleEndeks = " + vucutKutleEndeks);




    }
}
