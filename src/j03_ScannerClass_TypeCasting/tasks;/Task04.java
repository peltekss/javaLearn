package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("isim soyisim giriniz: ");
        String isimSoyisim = input.nextLine();
        System.out.println(isimSoyisim);
        System.out.print(" yaş giriniz: ");
        int yaş = input.nextInt();
        System.out.println(yaş);
        System.out.print("Kullanıcıdan kilo giriniz: ");
        int kilo = input.nextInt();
        System.out.println(kilo);
        System.out.print("Kullanıcıdan boy giriniz: ");
        int boy = input.nextInt();
        System.out.println(boy);
        System.out.print("Kullanıcıdan salona devam edeceğiniz ay giriniz: ");
        int ay = input.nextInt();

        System.out.println(" aylık ücret: " + (ay * 20));



    }
}
