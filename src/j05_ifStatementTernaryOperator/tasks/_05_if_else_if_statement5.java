package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class _05_if_else_if_statement5 {

    public static void main(String[] args) {

    /*  90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        double number = scan.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        double number2 = scan.nextDouble();
         if(number>number2) {
             System.out.println("Hello world");
         } else if (number2>number) {
             System.out.println("Not Hello World");
         }else System.out.println("I love java");




    }
}
