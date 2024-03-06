package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class
Task04 {

    public static void main(String[] args) {
		/*
		Task-> Girilen ay simine göre   ayin kac cektigini print eden code create ediniz.
		 */

        Scanner scn = new Scanner(System.in);
        System.out.println("Bir ay giriniz");
        String ay = scn.nextLine().toLowerCase();
        int gunSayisi;

        switch (ay) {
            case "ocak":
            case "mart":
            case "mayıs":
            case "temmuz":
            case "ağustos":
            case "ekim":
            case "aralık":
                System.out.println(gunSayisi = 31);
                break;
            case "nisan":
            case "haziran":
            case "eylül":
            case "kasım":
                System.out.println(gunSayisi = 30);
                break;
            case "şubat":
                System.out.println("Bir yıl giriniz: ");
                int yil = scn.nextInt();
                if (yil % 4 == 0 && yil % 100!= 0 || yil % 400 == 0) {
                    System.out.println(gunSayisi = 29);
                } else {
                    System.out.println(gunSayisi = 28);
                }
                break;
            default:
                System.out.println("Hatali giriş yaptınız");

        }




    }
}
