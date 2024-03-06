package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz.");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = n; i >0; i/=10) {
            sum += i%10;

        }
        System.out.println(sum);



    }
}
