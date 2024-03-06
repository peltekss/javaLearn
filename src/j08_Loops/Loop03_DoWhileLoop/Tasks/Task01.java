package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */
        Scanner input = new Scanner(System.in);
        int sayi;
        int toplam = 0;

        do {
            System.out.println("Bir sayı giriniz, bitirmek istediğinizde 0 sayısını giriniz.");
            sayi = input.nextInt();
            toplam+=sayi;



        }while (sayi!=0);
        System.out.println(toplam);











    }
}
