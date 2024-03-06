package j06_SwitchStatement;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        //Task-> Girilen ay numarasına göre mevsimini print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay numarasi giriniz");
        int ayNo = input.nextInt();
        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                // case 1,2,12 -> best practice : 14 (17-19-21...) version sonrası için
                System.out.println("Kış mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar mevsimi.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz mevsimi.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar mevsimi.");
                break;
            default:
                System.out.println("hatalı giriş yaptınız");

        }
    }
}
