package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char karakter = scanner.next().charAt(0);
        for (int i = 0; i < 10; i++) {
            System.out.print((char) (karakter + i));
        }


    }
}
