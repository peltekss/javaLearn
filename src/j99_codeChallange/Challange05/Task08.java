package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task08 {


    /*
    Task-> Girilen iki tamsayı arasındaki sayıların toplamını print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int sayı1 = input.nextInt();
        System.out.println("Lütfen sayı giriniz");
        int sayı2 = input.nextInt();
        int toplam = 0;
        if (sayı1 < sayı2) {
            for (int i = sayı1; i <= sayı2; i++) {
                System.out.println();
                toplam += i;
            }
            System.out.print(toplam);

        } else if (sayı2<sayı1) {
            for (int i = sayı1; i >=sayı2 ; i--) {
                toplam+=i;
            }
            System.out.print(toplam);

        }else System.out.println("Girilen sayılar eşit");


    }
}