package j04_JavaOperators.j01_AritmeticOperators.tasks;

import java.util.Scanner;

public class Task09 {


    /*Task->
     Çiftlikteki hayvanların ayaklarının toplam sayısını bulma.
     Çiftlikteki bulunun inek, koyun, tavukların ayak sayısını print eden code create ediniz.

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Çiftlikteki inek sayısnı giriniz: ");
        int inek = scanner.nextInt();
        int inekA = 4;
        System.out.println("Çiftlikteki koyun sayısını giriniz: ");
        int koyun = scanner.nextInt();
        int koyunA = 4;
        System.out.println("Çiftlikteki tavuk sayısını giriniz: ");
        int tavuk = scanner.nextInt();
        int tavukA = 2;

        System.out.println("Çiftlikteki ineklerin ayak sayısı: " + (inekA * inek));
        System.out.println("Çiftlikteki koyunların ayak sayısı: " + (koyunA * koyun));
        System.out.println("Çiftlikteki tavukların ayak sayısı: " + (tavukA * tavuk));



    }

}
