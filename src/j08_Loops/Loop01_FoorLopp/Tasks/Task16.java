package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scn.nextInt();
        if (sayi <= 1){
            System.out.println("1 ve küçük sayılar asal değildir.");
        }
        for (int i = 2; i <=Math.sqrt(sayi) ; i++) {
            if (sayi %i == 0){
                System.out.println(sayi+" asal değildir.");
                break;
            }

        }System.out.println("Asaldır");





    }
}
