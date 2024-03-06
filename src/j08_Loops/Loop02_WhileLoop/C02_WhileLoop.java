package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının rakamları toplamını print eden code create ediniz.
        // 2316->6+1+3+2       571622->2+2+6+1+7+5
        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayı giriniz: ");
        int number = scan.nextInt();
        int rakamlarToplamı = 0;
        while (number > 0) {
            rakamlarToplamı = rakamlarToplamı + number % 10;
            number = number / 10;
        }
        System.out.println("rakamlarToplamı: " + rakamlarToplamı);

    }
}
