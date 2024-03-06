package j09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
        //task-> girilen tamsayının asal olmasını kontrol eden code create ediniz
        //asal tamsayı: 1 ve kendisinden başka tam böleni olmayan sayılar->asil bölünemeyen sayı
        Scanner scan = new Scanner(System.in);
        System.out.print("Tamsayı giriniz: ");
        int tamsayi = scan.nextInt();
        boolean asalMi= true;//bayrak yukarı.
        for (int i = 2; i <tamsayi ; i++) {
            if (tamsayi%i==0){//tekrardan gelen herhangi bir sayıya bölünme şartı kontrol edilir.
                asalMi=false;//bayrak aşağı.
                break;//döngü kırıldı.
            }
        }
        System.out.println(asalMi?tamsayi+" sayısı asal sayıdır":tamsayi+" sayısı asal değildir.");
    }
}
