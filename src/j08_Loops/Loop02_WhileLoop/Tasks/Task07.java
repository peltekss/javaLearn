package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Map;
import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = Integer.MIN_VALUE;// int en küçük değeri bizze verir.

        int sayaç = 1;

        while (sayaç <= 5){
            System.out.println(sayaç+". sayıyı giriniz: ");
            int girilenSayi = input.nextInt();

            if (girilenSayi > sayi){
               sayi = girilenSayi;
            }
            sayaç++;
        }
        System.out.println("Girilen en büyük sayı: " + sayi);


    }


}
