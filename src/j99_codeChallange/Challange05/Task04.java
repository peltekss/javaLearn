package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task04 {
   /* task-> girilen sayıdan 1'e kadar olan tamsıyalrın karelerinin toplamını print eden code create ediniz..
	    Örnek Ekran Çıktısı
	    Girilen sayı=4               1 -> 1  2-> 4  3->9
	    Kareler toplamı=14
	     */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Girilen sayı: ");
        int sayı = input.nextInt();
        int toplam = 0;
        for (int i = sayı; i >= 1; i--) {//girilen sayıdan 1 e kadar tekrar tanımlandı
            toplam += i * i;//tekrardaki her bir sayının karesi topplama eklendi.
        }
        System.out.println("Kareler toplamı: " + toplam);



    }// main sonu
}// class sonu

