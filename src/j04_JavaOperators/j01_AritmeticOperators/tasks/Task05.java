package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task05 {

    /*
    Task->
     * Girilen saati  saniyeye çeviren program yazınız
     * Örnek : 1 saat 10 dakika 50 saniye - > 4250 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir saat giriniz: ");
        int saat = input.nextInt();
        System.out.println("Lütfen bir dakika giriniz: ");
        int dk = input.nextInt();
        System.out.println("Lütfen bir saniye giriniz: ");
        int saniye = input.nextInt();
        int sonuc =( (saat * 3600) + (dk * 60) + saniye);
        System.out.println(sonuc);


    }

}



























