package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task06 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz
        System.out.println("1.Boyutu giriniz: ");
        int boyut1 = input.nextInt();
        System.out.println("2.Boyutu giriniz: ");
        int boyut2 = input.nextInt();
        System.out.println("Hangi şekil: ");
        String sekil = input.next();

        switch (sekil){
            case "kare ":
                kareAlanı(boyut1);
                kareÇevresi(boyut1);
                break;
            case "dikdörtgen":
                dikdörtgenAlanı(boyut1, boyut2);
                dikdörtgenÇevresi(boyut1, boyut2);
                break;
            case "üçgen":
                System.out.println("3. boyutu giriniz.");
                int boyut3 = input.nextInt();
                üçgenAlanı(boyut1, boyut2);
                üçgenevresi(boyut1, boyut2, boyut3);
                break;
            default:
                System.out.println("Hata");
                break;
        }

 
    }//Deneme sonu

    private static void üçgenevresi(int boyut1, int boyut2, int boyut3) {
        System.out.println("Üçgenin çevresi: "+ (boyut1+boyut2+boyut3));
    }

    private static void üçgenAlanı(int boyut1, int boyut2) {
        System.out.println("Üçgenin alanı: "+ (boyut1*boyut2)/2);
    }

    private static void dikdörtgenÇevresi(int boyut1, int boyut2) {
        System.out.println("Dikdörtgenin çevresi: "+ (2*(boyut1+boyut2)));
    }

    private static void dikdörtgenAlanı(int boyut1, int boyut2) {
        System.out.println("Dikdörtgenin Alanı: "+ (boyut1*boyut2));
    }

    private static void kareÇevresi(int boyut1) {
        System.out.println("Karenin çevresi: "+ (4*boyut1));
    }

    private static void kareAlanı(int boyut1) {
        System.out.println("Karenin alanı: "+ (boyut1*boyut1));
    }


}//Class sonu
