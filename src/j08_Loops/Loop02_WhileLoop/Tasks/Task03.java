package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int sayı = sc.nextInt();
        System.out.println("Çarpım Tablosu (" + sayı + "):");
        int i = 1;

        while (i<=10){
            int result = sayı*i;
            System.out.print(sayı+"x"+i+"="+result+" ");
            i++;

        }



    }

}
