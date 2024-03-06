package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task->  Girilen bir tamsayının onlar basamağının harf karakteri ile  print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Tamsayı giriniz");
        int tamsayi = scan.nextInt();
        int onlarBasamaği = (tamsayi / 10) % 10;


       /* if (onlarBasamaği == 0){
            System.out.println("s");

        }else if (onlarBasamaği == 1){
            System.out.println("b");
        }else if (onlarBasamaği == 2) {
            System.out.println("i");
        } else if (onlarBasamaği == 3) {
            System.out.println("ü");
        } else if (onlarBasamaği == 4){
            System.out.println("d");
        } else if (onlarBasamaği == 5){
            System.out.println("e");
        } else if (onlarBasamaği == 6) {
            System.out.println("a");
        } else if (onlarBasamaği == 7) {
            System.out.println("y");
        } else if (onlarBasamaği == 8) {
            System.out.println("s");
        }else if (onlarBasamaği == 9){
            System.out.println("n");

    }*/
        switch (onlarBasamaği) {
            case 0: System.out.println("s");break;
            case 1: System.out.println("b");break;
            case 2: System.out.println("i");break;
            case 3: System.out.println("ü");break;
            case 4: System.out.println("d");break;
            case 5: System.out.println("e");break;
            case 6: System.out.println("a");break;
            case 7: System.out.println("y");break;
            case 8: System.out.println("f");break;
            case 9: System.out.println("n");break;
            default: System.out.println("Geçerli karakter giriniz");
        }

    }
}
