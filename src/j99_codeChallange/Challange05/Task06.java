package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task06 {
    /* Interview Question
    Write a Java program to reverse a string.
    Use for loop and create a method called reverseString */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen metin giriniz");
        String metin = scan.nextLine();//Ali -> ilA
        for (int i = metin.length() - 1; i >= 0; i--) {//girilen metnin son karakterinden ilk karakterine kadar print eder.
            System.out.print(metin.charAt(i));

        }
    }


}


