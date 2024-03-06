package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
/*
        task-> girilen boyutta kare çarpım tablosu print eden code create ediniz
          Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25

       5x5
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Çarpım tablosunun boyutunu giriniz");
        int boyut = scan.nextInt();
        for (int i = 1; i <= boyut; i++) {
            for (int j = 1; j <= boyut; j++) {
                int result = i*j;
                System.out.print(String.format("%-4d", result));
            }
            System.out.println();

        }

    }
}
