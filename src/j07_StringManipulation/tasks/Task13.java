package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scan.nextLine();
        System.out.println(metin.replaceAll("\\s", "").length());


    }
}
