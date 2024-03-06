package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız
        System.out.println();

        Scanner scan = new Scanner(System.in);
        System.out.println("pazartesi->1\nsali->2\ncarsamba->3\npersembe->4\ncuma->5\ncumartesi->" +
                "6\npazar->7\nHaftanın kacıncı günü oldugunu secin: ");
        int gun = scan.nextInt();
        if (gun>0 && gun<8 ) {
            int mod = (gun + 100)%7;
            switch (mod) {
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Salı");
                    break;
                case 3:
                    System.out.println("Çarşamba");
                    break;
                case 4:
                    System.out.println("Perşembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;
                case 6:
                    System.out.println("Cumartesi");
                    break;
                case 7:
                    System.out.println("Pazar");
                    break;
                default:
                    System.out.println("Geçerli gün giriniz");
                    break;
            }
        }else System.out.println("Lütfen 0 ile 8 arası bir rakam giriniz");



    }
}

