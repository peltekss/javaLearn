package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen sayı giriniz");
        int sayı1 = input.nextInt();
        System.out.println("Lütfen ikinci sayıyı giriniz");
        int sayı2 = input.nextInt();

        int toplam = 0;
        for (int i = sayı1+1; i < sayı2; i++) {
            toplam += i;

        }
        System.out.println(toplam);



    }
}
