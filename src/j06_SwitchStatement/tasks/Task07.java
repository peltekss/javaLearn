package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        // Task-> Girilen 3 basamaklı bir sayıyı harf karakteri ile print eden code create ediniz.
        Scanner sc = new Scanner(System.in);
        System.out.println("3 basamakllı sayı giriniz.");
        int sayi = sc.nextInt();

        if (sayi <= 999 && sayi >= 100){

            int birler = sayi % 10;
            int onlar = (sayi / 10) % 10;
            int yuzler = sayi / 100;


            switch (yuzler) {
                case 0: System.out.println("");break;
                case 1: System.out.println("yuz");break;
                case 2: System.out.println("iki yuz");break;
                case 3: System.out.println("üç yuz");break;
                case 4: System.out.println("dort yuz");break;
                case 5: System.out.println("beş yuz");break;
                case 6: System.out.println("altı yuz");break;
                case 7: System.out.println("yedi yuz");break;
                case 8: System.out.println("sekiz yuz");break;
                case 9: System.out.println("dokuz yuz");break;
            }
            switch (onlar) {
                case 0: System.out.println("");break;
                case 1: System.out.println("on");break;
                case 2: System.out.println("yirmi");break;
                case 3: System.out.println("otuz");break;
                case 4: System.out.println("kırk");break;
                case 5: System.out.println("elli");break;
                case 6: System.out.println("altmış");break;
                case 7: System.out.println("yetmiş");break;
                case 8: System.out.println("seksen");break;
                case 9: System.out.println("doksan");break;
            }
            switch (birler) {
                case 0: System.out.println("");break;
                case 1: System.out.println("bir");break;
                case 2: System.out.println("iki");break;
                case 3: System.out.println("üç");break;
                case 4: System.out.println("dort");break;
                case 5: System.out.println("beş");break;
                case 6: System.out.println("altı");break;
                case 7: System.out.println("yedi");break;
                case 8: System.out.println("sekiz");break;
                case 9: System.out.println("dokuz");break;
            }
        }else{
            System.out.println("Geçerli bir sayı giriniz.");
        }

    }
}
