package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir pozitif sayı giriniz.");
        int sayı = sc.nextInt();
        int karekok = 1;
        int count=0;
         do{
            if (karekok*karekok==sayı) {
                System.out.println("Girilen sayı tam karedir.");
                count++;
            }
            karekok++;
        }while (karekok*karekok<=sayı);
        if (count==0){
            System.out.println("Girilen sayının karekoku yoktur.");
        }







    }
}
