package j10_MethodCreation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {
        // task-> girilen 3 sayının ortalamasını print eden METHOD create ediniz
//        Scanner scan = new Scanner(System.in);
//        int toplam=0;
//        for (int i = 1; i <=3 ; i++) {
//            System.out.println(i+ " . sayıyı giriniz");
//            int sayı=scan.nextInt();
//            toplam+=sayı;
//
//        }
        ortalamaAl(toplam());

    }

    private static int toplam() {
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        for (int i = 1; i <= 3; i++) {
            System.out.println(i + " . sayıyı giriniz");
            int sayı = scan.nextInt();
            toplam += sayı;

        }
        return toplam;
    }

    private static void ortalamaAl(int toplam) {
        System.out.println("Girilen sayıların ortalaması." + (toplam / 3));

    }


}
