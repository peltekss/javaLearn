package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        /*
        task -> x karakteri girilene kadar "javaCAN" x karakteri girildiğinde "javaTAR" print eden code create ediniz.
        do-while lopp
       */
        Scanner scan=new Scanner(System.in);

        boolean kosul = true;
//        do {
//            System.out.println("Bir karakter giriniz.");
//            char ch = scan.next().charAt(0);
//            if (ch!='x' && ch!='x') {
//                System.out.println("javaCAN");
//            }else {
//                System.out.println("javaTAR");
//                kosul = false;
//            }
//        }while (kosul);

        //2.yol
        do {
            System.out.println("Bir karakter giriniz.");
            char ch = scan.next().charAt(0);
            if (ch!='x' && ch!='X') {
                System.out.println("javaCAN");
            }else {
                System.out.println("javaTAR");
                break;
            }
        }while (kosul);



    }
}
