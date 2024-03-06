package j99_codeChallange.Challange05;

import java.util.Scanner;

public class Task05 {
    /* task-> girilen satır ve sutun değerleri için aşağıdaki şekli print eden code create ediniz.
	 	Get the number of rows and columns from user.
	 	Create a rectangle.
	 	rows = 3 and column = 5 ==> * * * * *
	 	                            * * * * *
	 	                            * * * * *
	 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen satır giriniz");
        int satır = input.nextInt();
        System.out.println("Lütfen sutun giriniz");
        int sütun= input.nextInt();
        for (int i = 1; i <= satır; i++) {//i=1,2,3.. satır kontrolü
            for (int j = 1; j <= sütun; j++) {//j=1,2,3.. sütun kontrolü
                System.out.print("* ");
            }
            System.out.println();// dumy hayalet komut satır düzeni sağlar.
        }



    }


}
