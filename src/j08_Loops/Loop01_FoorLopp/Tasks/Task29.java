package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK

        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir String giriniz : ");
        String str = sc.nextLine();


        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if(i%2==0){
                System.out.print(Character.toUpperCase(ch));

            }else System.out.print(Character.toLowerCase(ch));

        }
        System.out.println();


    }
}
