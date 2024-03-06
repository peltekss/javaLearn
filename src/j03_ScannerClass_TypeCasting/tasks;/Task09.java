package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        Scanner sc = new Scanner(System.in);
        System.out.print("a sayısını giriniz: ");
        double a = sc.nextDouble();
        System.out.print("b sayısını giriniz: ");
        double b = sc.nextDouble();
        System.out.print("c sayısını giriniz: ");
        double c = sc.nextDouble();
        double sonuç = ((a * a) - (b * b)) / 3 * c;
        System.out.println(sonuç);


    }
}
