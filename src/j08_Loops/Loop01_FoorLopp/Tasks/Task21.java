package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task21 {

    /*
             *
            * *
           * ! *
          * ! ! *
         * ! ! ! *
        * ! ! ! ! *
       * ! ! ! ! ! *
      * * * * * * * *
      şekli print eden code create ediniz.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Satır giriniz: ");
        int satır = sc.nextInt();

        for (int i = 1; i <= satır; i++) {

            for (int j = satır; j >=i ; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {
                if (j==1||j==i||i==satır) {
                    System.out.print("* ");
                }else System.out.print("! ");
            }
            System.out.println();
        }




    }

}
































