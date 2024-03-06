package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task03_TekSayıAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayı = scan.nextInt();
        int tekSayı = 0;
        for (int i = 1; i <= sayı; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
                tekSayı++;//loop dan gelen tek sayı adedi 1 artırıldı.
            }
        }
        System.out.println("tek sayı adedi:" +tekSayı);


    }

}
