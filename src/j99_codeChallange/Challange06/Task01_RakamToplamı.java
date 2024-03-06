package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task01_RakamToplamı {
    // Task-> girilen sayının basamaklarındaki rakamların toplamını print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayı = scan.nextInt();

        int toplam = 0;//loop dan gelen rakamların toplanacağı boş conteiner tanımlandı.
        while (sayı > 0) {

            toplam += sayı % 10;//birler bsm rakam toplama ataandı.
            sayı = sayı / 10;

        }
        System.out.println(toplam);

    } // main sonu

}// Class sonu