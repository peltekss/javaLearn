package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */
        Random rdm = new Random();
        int rasgeleSayi = rdm.nextInt(100);//Burası 100 den küçük rastgele sayi üretiyor.
        Scanner scan = new Scanner(System.in);

        int count = 0;
        int sayi = 0;

        while (sayi != rasgeleSayi) {//false
            System.out.print("Lütfen 1 ile 100 arasında sayı giriniz:");
            sayi = scan.nextInt();

            if (rasgeleSayi > sayi) {
                System.out.println("Lütfen daha büyük bir sayı giriniz.");

            } else if (rasgeleSayi < sayi) {
                System.out.println("Lütfen daha küçük bir sayı giriniz.");
            }else {
                System.out.println("Terikler");
            }

            count++;
        }
        System.out.println("rasgeleSayi = " + rasgeleSayi);
        System.out.println("Tebrikler " + count + ". denemede sayıyı doğru tahmin ettiniz");


    }

}
