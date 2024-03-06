package j09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner scan = new Scanner(System.in);
        String pin = "JavaNur";
        int grsHakki = 3;
        while(true){
            System.out.println("Pin kodunuzu giriniz.");
            String kulPin=scan.next();
            if(kulPin.equals(pin)){
                System.out.println("Pin geçerli. Hoşgeldiniz");
                break;
            }else {
                grsHakki--;
                if (grsHakki==0){
                    System.out.println("Hakkın kalmadı telefoncuya git.");
                    break;
                }
                System.out.println("Hatalı pin girdiniz. Tekrar deneyiniz");
                System.out.println(grsHakki+" tane denme hakkın kaldı");

            }
        }

    }

}
