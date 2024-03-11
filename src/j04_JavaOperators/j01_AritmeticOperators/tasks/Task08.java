package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task08 {
    /*Task->
     * Saniyeyi saat, dk ve saniyeye çeviren bir program yazınız.
     * 		Örnek : 4250 - > 1 saat 10 dakika 50 saniye
     * 1 saat = 3600 saniye
     * 1 dk   = 60 saniye
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir saniye giriniz");
        int toplamSaniye = scan.nextInt();

        int saat = (toplamSaniye/3600);
        toplamSaniye %= 3600;
        int dk = (toplamSaniye%3600)/60;
        int saniye = (toplamSaniye%60);
        System.out.println(saat + " saat " + dk + " dakika " + saniye + " saniye");

    }
}
