package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


        // task-> istenilen kadar tamsayının toplamını print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaç adet sayı toplamak istiyorsunuz: ");
        int adet = sc.nextInt();
        int toplam = 0;
        int sayac = 1;

        while (sayac <= adet){
            System.out.print(sayac+". sayıyı giriniz.");
            int giriilenSayi = sc.nextInt();
            toplam += giriilenSayi;
            sayac++;
        }

        System.out.println((sayac-1) + " adet sayı girdiniz. Sayıların toplamı: "+toplam);


    }

}
