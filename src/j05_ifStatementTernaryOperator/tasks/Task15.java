package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task15 {

    public static void main(String[] args) {
        /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Ehliyetiniz varsa 1'i yoksa o'ı seçiniz");
        int ehliyetVarMı = scan.nextInt();
        if (ehliyetVarMı == 1) {
            System.out.println("Kaç yıldır ehliyetiniz var?");
            int tecrübe = scan.nextInt();
            if (tecrübe >= 7) {
                System.out.println("Kaç km araba kullandınız.");
                int km = scan.nextInt();
                if (km >= 100000) {
                    System.out.println("kontak anahtarı alabilirsiniz");
                } else
                    System.out.println("kontak anahtarı alabilmen için " + (100000 - km) + " km daha araba kullanmanız lazım.");
            } else {
                System.out.println("Kontak anahtarı alabilmen için " + (7 - tecrübe) + " yıl daha geçmesi lazım");
            }
        }else if (ehliyetVarMı == 0) {
            System.out.println("kontak anahtarı verebilmem için önce ehliyet al");
        } else System.out.println("Hatalı değer girdiniz.");
    }
}






















