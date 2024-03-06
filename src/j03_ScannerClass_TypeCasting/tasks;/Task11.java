package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task11 {

    /* Task->
     * Kullanicidan bir character girmesini isteyin ve
     * girilen karakteri ve ascii degerini yazin
     *
     * Ornek : Input  : a
     *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
     *
     *
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Bir karakter giriniz: ");
        char input = sc.next().charAt(0);

        int Deger = input;
        System.out.println(Deger);



    }


}
