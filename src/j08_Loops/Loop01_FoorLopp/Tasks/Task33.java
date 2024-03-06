package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task33 {
    /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)



        */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int sayı = scan.nextInt();
        int toplam =0;
        for (int i = 1; i < sayı; i++) {
            if (sayı % i == 0) {
                toplam+=i;
            }

        }
        if (toplam == sayı) {
            System.out.println("Mükemmel sayi");
        }else {
            System.out.println("Mükemmel sayı değildir.");
        }


    }


}
