package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task04_SayıOyunu {

    /*
    Task->vGirilen sayıların toplamını print eden ve girilen sayı toplamı 100'den buyuk ise
    girilen sayı adetini print eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sayıToplam = 0;
        int sayıAdet = 0;

        for (int i = 1; i < 100; i++) {
            System.out.println("sayı giriniz = " + i);
            int sayı = input.nextInt();
            sayıToplam += sayı;
            sayıAdet++;

            if (sayıToplam > 100) {
                System.out.println("sayı adet = " + sayıAdet);
                System.out.println("sayı toplam: " + sayıToplam);
                break;
            }
        }
        System.out.println();


    }

}
