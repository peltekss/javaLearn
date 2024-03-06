package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task01_NestedIfStatement {
    /* Task->
       Girilen  yas data için
            oy kullanma yasi :
             age >= 18  ==> oy kullanmaya uygun
             age >= 70  ==> uc kez oy kullanabilir
             70 > age >=50 ==> iki kez oy kullanabilir
             50 > age >=18 ==> bir kez oy kullanabilir,
             print eden code create ediniz...
         */
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir yaş giriniz: ");
        int age = scn.nextInt();
        if (age >= 18) {
            System.out.println("Oy kullanmaya uygundur.");
        } else if (age >= 70) {
            System.out.println("Uc kez oy kullanabilir.");

        } else if (age > 70 && age >= 50) {
            System.out.println("Iki kez oy kullanabilir.");
        } else if (age < 50 && age >= 18) {
            System.out.println("Bir kez oy kullanabilir.");
        } else System.out.println("Geçerli bir sayı giriniz");

    }// main sonu
}