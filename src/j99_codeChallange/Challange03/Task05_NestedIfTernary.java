package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task05_NestedIfTernary {
/* Task ->
       0 ~ 9 arasındaki sayilari ENG translate eden  code create ediniz.
       sayı 9'dan buyuk veya sifirdan kucukse, "Gecersiz" print ediniz.
      NestedIf ve Ternary kullanarak 2 yolla da cozunuz
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("0-9 arası bir rakam giriniz");
        int rkm = scan.nextInt();
        System.out.println((rkm >=0 && rkm <=9) ? (rkm ==0) ? "zero" : (rkm == 1) ? "one" : (rkm == 2) ? "two" : (rkm == 3) ?
                "three" : (rkm == 4) ? "four" : (rkm == 5) ? "five" : (rkm == 6) ? "six" :
                (rkm == 7) ? "seven" : (rkm == 8) ? "eight" : (rkm == 9) ? "nine" : "": "Geçersiz");


    }// main sonu
}
