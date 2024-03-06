package j09_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
        /*
        Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
        atlar ve loop'un bir sonraki değerinden devam eder.
        */

        // Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir mail hesabı giriniz.");
        String mail = sc.nextLine();
        String yeniMail = "";
        for (int i = 0; i <= mail.length() - 1; i++) {//mailin indexi kadar çalışacak.
            if (mail.charAt(i)==' '){//tekrardan gelen her karakterin ' ' eşit olma durumu kontrol edilir.
                continue;// if true olduğu zaman döngü bir sonraki indexe atlayıp devam edecek.
            }
            yeniMail+=mail.charAt(i);
        }
        System.out.println(yeniMail);


    }

}
