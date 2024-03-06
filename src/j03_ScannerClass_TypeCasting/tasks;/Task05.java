package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {


        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.print("Bir tam sayı giriniz: ");
        double sayi = input.nextDouble();
        System.out.println("Bir tam sayı daha giriniz");
        double sayi1 = input.nextDouble();
        System.out.println(sayi * sayi1);
        System.out.println(sayi + sayi1);
        System.out.println(sayi - sayi1);
        System.out.println(sayi / sayi1);



    }

}
