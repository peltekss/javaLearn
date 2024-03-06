package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task18 {
    /* Koç Burcu : 21 Mart - 20 Nisan
       Boğa Burcu : 21 Nisan - 21 Mayıs
       İkizler Burcu : 22 Mayıs - 22 Haziran
       Yengeç Burcu : 23 Haziran - 22 Temmuz
       Aslan Burcu : 23 Temmuz - 22 Ağustos
       Başak Burcu : 23 Ağustos - 22 Eylül
       Terazi Burcu : 23 Eylül - 22 Ekim
       Akrep Burcu : 23 Ekim - 21 Kasım
       Yay Burcu : 22 Kasım - 21 Aralık
       Oğlak Burcu : 22 Aralık - 21 Ocak
       Kova Burcu : 22 Ocak - 19 Şubat
       Balık Burcu : 20 Şubat - 20 Mart

       switch-case kullanmadan yapınız. */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Kaçıncı ayda doğdunuz");
        int ay = scan.nextInt();
        System.out.println("Doğum gününüzü giriniz");
        int gün= scan.nextInt();
        if (gün>=1&&gün<=31){
            if(ay==1){
                if(gün<=21){
                    System.out.println("oğlak burcu");

                }else {
                    System.out.println("Kova burcu.");
                }
            }
            if(ay==2) {
                if (gün <= 19) {
                    System.out.println("kova burcu");

                } else {
                    System.out.println("balık burcu.");
                }
            }
            if(ay==3) {
                if (gün <= 20) {
                    System.out.println("balık burcu");

                } else {
                    System.out.println("Koç burcu.");
                }
            }
            if(ay==4) {
                if (gün <= 20) {
                    System.out.println("koç burcu");

                } else {
                    System.out.println("boğa burcu.");
                }
            }
            if(ay==5) {
                if (gün <= 21) {
                    System.out.println("Boğa burcu");

                } else {
                    System.out.println("İkizler burcu.");
                }
            }
            if(ay==6) {
                if (gün <= 22) {
                    System.out.println("ikizler burcu");

                } else {
                    System.out.println("yengeç burcu.");
                }
            }
            if(ay==7) {
                if (gün <= 22) {
                    System.out.println("yengeç burcu");

                } else {
                    System.out.println("aslan burcu.");
                }
            }
            if(ay==8) {
                if (gün <= 22) {
                    System.out.println("aslan burcu");

                } else {
                    System.out.println("başak burcu.");
                }
            }
            if(ay==8) {
                if (gün <= 22) {
                    System.out.println("başak burcu");

                } else {
                    System.out.println("Terazi burcu.");
                }
            }
            if(ay==9) {
                if (gün <= 22) {
                    System.out.println("Terazi burcu");

                } else {
                    System.out.println("Akrep burcu.");
                }
            }
            if(ay==10) {
                if (gün <= 21) {
                    System.out.println("Akrep burcu");

                } else {
                    System.out.println("Yay burcu.");
                }
            }
            if(ay==11) {
                if (gün <= 21) {
                    System.out.println("Yay burcu");

                } else {
                    System.out.println("Oğlak burcu.");
                }
            }
            if(ay==12) {
                if (gün <= 21) {
                    System.out.println("Oğlak burcu");

                } else {
                    System.out.println("Kova burcu.");
                }
            }

        }else System.out.println("Geçerli bir tarih giriniz");


    }
}
