package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task12 {
    /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı print eden code create ediniz
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Para giriniz: ");
        double para = input.nextDouble();
        double KDV = para * 0.18;
        double KDVliFiyat = para * 0.08;


        if (para >= 0 && para <= 1000) {
            System.out.println("KDV: " + KDV);
            System.out.println("KDVli Fiyat: " + (KDV+para));

        }else if (para >1000)
            System.out.println("KDVli Fiyat: " + (KDVliFiyat+para));
        else System.out.println("Lütfen 0'dan büyük bir sayı giriniz.");

    }
}
