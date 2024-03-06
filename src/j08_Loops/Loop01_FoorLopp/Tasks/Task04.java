package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir tamsayı giriniz.");
        int sayi = scn.nextInt();
        System.out.println("İkinci bir tamsayı giriniz");
        int sayi1 = scn.nextInt();

        for (int i =(sayi<sayi1?sayi:sayi1) ; i <=(sayi>sayi1?sayi:sayi1) ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        /*if (sayi < 100 || sayi > 0) {
        if (sayi1 < 100 || sayi1 > 0) {
        for (int i = sayi; i < sayi1; i++) {
        if (i % 2 == 0) {
        System.out.print(i + " ");
                    }

                            }
                            } else System.out.print("geçerli bir sayı giriniz");


        }*/
    }
}
