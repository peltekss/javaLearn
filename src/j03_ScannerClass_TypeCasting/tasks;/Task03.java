package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print eden code create ediniz
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Günde kaç saat uyuyorsunuz: ");
        int saat = input.nextInt();
        int ay = (saat * 30) / 24;
        int yıl = (365 * 8) / 24;
        int yılK = (yıl * 40);
        System.out.println("ay = " + ay);
        System.out.println("yıl = " + yıl);
        System.out.println("yılK = " + yılK);

    }
}
