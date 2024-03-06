package j08_Loops.Loop03_DoWhileLoop.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri pirnt eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("İlk karakteri giriniz.");
        char ilk = input.next().charAt(0);

        System.out.println("Son karakteri giriniz.");
        char son = input.next().charAt(0);

        if (ilk<son) {
            do {
                System.out.print(ilk+ " ");
                ilk++;
            }while (ilk <= son);
        }else{
            do {
                System.out.print(son+ " ");
                son++;
            }while (son<=ilk);

        }




    }
}
