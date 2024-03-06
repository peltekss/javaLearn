package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        // task ->  Girilen bir sayıya kadar  olan tek sayıları print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayi = scan.nextInt();

        int sayac = 1;

        while (sayac <= sayi) {

            System.out.print(sayac+" ");
            sayac+=2;
        }


    }
}
