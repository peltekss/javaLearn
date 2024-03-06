package j05_ifStatementTernaryOperator.tasks;

import java.util.Scanner;

public class Task21 {

    public static void main(String[] args) {
        /* Task->
        a) Son basamak 5 ‘e esit ve 5 den buyukse, yuvarlama islemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den kucukse, yuvarlama islemi: “Son basamagi bir alt ondaliga yuvarla”
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı giriniz");

        int sayı = scanner.nextInt();
        if(sayı%10>=5){
            int birler = sayı%10;
            System.out.println("sayı : "+( sayı+(10-birler)));
        }else{
            int birler = sayı % 10;
            System.out.println("sayı : "+ (sayı-birler));

        }


    }

}
