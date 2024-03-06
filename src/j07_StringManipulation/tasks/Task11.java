package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir ad ve bir soyad giriniz");
        String adSoyad = scanner.nextLine();
        System.out.println(adSoyad.substring(0, adSoyad.indexOf(" ")));
        System.out.println(adSoyad.substring(adSoyad.indexOf(" ") + 1));







    }
}
