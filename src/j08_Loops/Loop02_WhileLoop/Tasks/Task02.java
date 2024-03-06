package j08_Loops.Loop02_WhileLoop.Tasks;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        int başlangıçSayı = sc.nextInt();
        System.out.println("İkinci sayıyı giriniz.");
        int bitişSayı = sc.nextInt();

        System.out.println("***For ile çözümü***");
        if (başlangıçSayı <= bitişSayı) {
            for (int i = başlangıçSayı; i <= bitişSayı; i++) {
                System.out.print(i + " ");
            }

        } else
            for (int i = başlangıçSayı; i >= bitişSayı; i--) {
                System.out.print(i+ " ");

            }


        System.out.println("\n"+"***While ile çözümü***");
        if (başlangıçSayı <= bitişSayı) {
            while (başlangıçSayı <= bitişSayı) {
                System.out.print(başlangıçSayı + " ");
                başlangıçSayı++;
            }
        }else
            while (başlangıçSayı >= bitişSayı) {
                System.out.print(başlangıçSayı + " ");
                başlangıçSayı--;
            }
    }


}


