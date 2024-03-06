package j06_SwitchStatement;

import java.util.Scanner;

public class
C05_SwitchCase_ATM {
    public static void main(String[] args) {
        /*
        TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
        ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz.
        */
        Scanner scanner = new Scanner(System.in);
        int bakiye=1000;
        System.out.println("*** Java Bank'a Hoşgeldiniz ***");
        System.out.println("Yapmak istediğiniz işlemin numarasını giriniz : \n1->Bakiye sorgulama \n2->Para çekme\n3->Para Yatırma\n4->Çıkış");
        int secim = scanner.nextInt();
        switch (secim){
            case 1:
                System.out.println("Hesabında " + bakiye + "$ bakiyen var");
                break;
            case 2:
                System.out.println("Ne kadar para çekmek istiyorsun? : ");
                int çekilenMiktar = scanner.nextInt();
                if (çekilenMiktar <= bakiye){
                bakiye -= çekilenMiktar;
                System.out.println("Bakiye : " + bakiye + "$");
                }else {
                    System.out.println("Yetersiz bakiye.");
            }
            break;
            case 3:
                System.out.println("Ne kadar para yatıracaksınız?");
                int yatırılanMiktar=scanner.nextInt();
                if (yatırılanMiktar>0){
                    bakiye+=yatırılanMiktar;
                    System.out.println("Para yatırma işlemi başarıyla gerçekleşti. Yeni bakiyeniz: " + bakiye + "$");
                } else {
                    System.out.println("Hatalı giriş yaptınız.");
                }
                break;
            case 4:
                System.out.println("Çıkış yapıyorsunuz.");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }




    }
}
