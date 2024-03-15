package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    static Scanner scan = new Scanner(System.in);//herkes ulassın diye class levela tanımlandı.
    //static derneğine üye yapıldı

    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Çevrilecek birimi giriniz-> saat/mil/kg ");
//        String birim = scan.next().toLowerCase();
//        System.out.println("Çevrilecek birimin miktarını giriniz:");
//        double miktar = scan.nextDouble();
        donustur(birimVer(), miktarVer());


    }//Deneme sonu

    private static void donustur(String birim, double miktar) {
        switch (birim) {
            case "saat":
                saatSaniye(miktar);//System.out.println("Girdiğiniz  " + miktar + "saatin saniye değeri=" + (miktar * 3600));
                break;

            case "mil":
                milKm(miktar);//System.out.println("Girdiğiniz  " + miktar + "milin km değeri=" + (miktar * 1.6));
                break;

            case "kg":
                kgGr(miktar);//System.out.println("Girdiğiniz  " + miktar + "kg'nin gr değeri=" + (miktar * 1000));
                break;

            default:
                System.out.println("Hatalı değer girdiniz.");

        }

    }

    private static void kgGr(double miktar) {
        System.out.println("Girdiğiniz  " + miktar + "kg'nin gr değeri=" + (miktar * 1000));
    }

    private static void milKm(double miktar) {
        System.out.println("Girdiğiniz  " + miktar + "milin km değeri=" + (miktar * 1.6));
    }

    private static void saatSaniye(double miktar) {
        System.out.println("Girdiğiniz  " + miktar + "saatin saniye değeri=" + (miktar * 3600));
    }
    public static String birimVer() {

        System.out.print("Çevrilecek birimi giriniz-> saat/mil/kg ");
        String birim = scan.next().toLowerCase();
        return birim;

    }
    public static double miktarVer(){

        System.out.println("Çevrilecek birimin miktarını giriniz:");
        double miktar = scan.nextDouble();
        return miktar;

    }

}// Class sonu
