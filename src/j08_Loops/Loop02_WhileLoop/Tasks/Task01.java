package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner sc = new Scanner(System.in);

        int sayac = 1;
        int toplam = 0;

        while (toplam < 333) {

            System.out.print(sayac + ". sayıyı giriniz:");
            int sayı = sc.nextInt();

            toplam += sayı;
            sayac++;

        }
        System.out.print((sayac - 1) + " adet sayı girdiniz. Toplamları: " + toplam);


    }
}
