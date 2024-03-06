package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String str = scan.nextLine();
        System.out.println("Kaçıncı index'deki karakteri istiyorsunuz");
        int karakter= scan.nextInt();

        if(karakter<str.length()) {
            System.out.println(str.charAt(karakter));
        }else System.out.println("Girdiğiniz index numarası metindeki karakter sayısını aşıyor.");


    }
}
