package j06_SwitchStatement;

import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {
        //TASK-> Giriilen haftanın gününü hafta içi veya sonu olduğunu print eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        System.out.println("Haftanın bir gününü giriniz.");
        String gun = scan.next().toLowerCase();
        switch (gun){
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("Girilen gün HAFTAİÇİ'DİR");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Girilen gün HAFTASONU'DUR");
                break;
            default:
                System.out.println("Hatalı giriş yaptınız.");


        }
    }
}
