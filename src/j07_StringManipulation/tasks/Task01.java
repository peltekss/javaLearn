package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scn.nextLine();
        System.out.println(metin.isEmpty());


    }
}

