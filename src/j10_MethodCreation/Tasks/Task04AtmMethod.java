package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task04AtmMethod {//amele köyü
    static Scanner scan = new Scanner(System.in);
    static int bakiye = 1000;//Her metodda kullanabilmek için buraya koyduk.

    public static void anaMenu() {

        System.out.println("Lütfen İşleminizi Seçiniz");
        int islem = scan.nextInt();
        switch (islem) {
            case 1:
                bakiyeSorgu();
                girisEkrani();
                break;
            case 2:
                paraCekme();
                break;
            case 3:
                paraYatırma();
                break;
            case 0:
                cikis();
                break;
            default:
                System.out.println("Geçersiz İşlem");
                girisEkrani();
        }
    }

    private static void paraYatırma() {
        System.out.println("Yatıracağınız miktarı giriniz: ");
        int miktar = scan.nextInt();
        bakiye+=miktar;
        System.out.println("Para Yatırma işleminiz başarıyla gerçekleştirildi.\nAnemenuye yönlendiriiyorsunuz.");
        girisEkrani();
    }

    private static void paraCekme() {
        System.out.println("Çekmek istediğiniz miktarı giriniz =");
        int miktar = scan.nextInt();
        if (miktar > bakiye) {
            System.out.println("Yetersiz Bakiye");
            bakiyeSorgu();
            paraCekme();
        } else {
            System.out.println("Para Çekme işleminiz başarıyla gerçekleştirildi.\nAnemenuye yönlendiriiyorsunuz.");

            bakiye -= miktar;
        }
        girisEkrani();
    }

    private static void bakiyeSorgu() {
        System.out.println("Bakiyeniz = " + bakiye + "$");
        //girisEkrani();
    }


    private static void cikis() {
        System.out.println("ATM'den çıkışınız başarıyla yapılmıştır.");
    }


    public static void girisEkrani() {
        System.out.println();
        System.out.println("*** JavaBANK'a HOŞGELDİNİZ ***\n" +
                "ISLEM MENUSU : \n" +
                "Bakiye Sorgu ->1\nPara Çekme -> 2\nPara Yatırma -> 3\nÇıkış -> 0");
        anaMenu();
    }

}
