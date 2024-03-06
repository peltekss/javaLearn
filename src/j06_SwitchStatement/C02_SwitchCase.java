package j06_SwitchStatement;

import java.util.Scanner;

public class
C02_SwitchCase {
    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre ayın isimini print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("Bir ay numarasi giriniz");
        int ayNo = input.nextInt();
        switch (ayNo) {
            default://Switch hic bir case calismazsa default calisir
                //Default switch icinde herhangi bir yere yazilabilir run sirasi yazim sirasina bakmaz
                System.out.println("Hatali giris");
                break;
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 12:
                System.out.println("Aralik");
                break;
        }

        System.out.println("Kod normal bir sekilde calisiyor");
    }
}
