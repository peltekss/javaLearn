package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        int sayı = 1;
        for (int i = 1; i <= input; i++) {
            sayı = sayı * i;
        }
        System.out.println(sayı);

    }
}
