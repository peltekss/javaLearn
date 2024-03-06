package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task18 {

    /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığınıkontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int sayi = sc.nextInt();


        boolean katıMı = false;
        int çarpım = 1;

        for (int i = 1; i <sayi ; i++) {
            çarpım*=3;
            if (çarpım==sayi){
                katıMı = true;
                break;
            }

        }
        System.out.println(katıMı);


    }
}
