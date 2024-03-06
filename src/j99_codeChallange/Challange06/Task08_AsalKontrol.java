package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task08_AsalKontrol {
    /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayi = input.nextInt();
        boolean asalMi = true;
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                //System.out.println("girilen sayı asal değil.");
                break;

            }

        }
        System.out.println(asalMi ? "Girilen sayı asaldır." : "Sayı asal değil.");

        System.out.println("**While ile**");

        int bolen=2;
        while (sayi > bolen) {
            bolen++;
            if (sayi % 2 == 0) {
                asalMi = false;
                break;
            }
        }
        System.out.println(asalMi ? "Girilen sayı asaldır." : "Sayı asal değil.");


    }


}
