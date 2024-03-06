package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */

        Scanner sc = new Scanner(System.in);
        System.out.println("String giriniz");
        String str = sc.nextLine();
        int temp = str.replaceAll("\\D", "").length();
        if (temp >0 ){
            System.out.println(str + " içinde "  + temp+ " adet rakam vardır");
        }else System.out.println(str+ " içinde rakam yoktur.");
    }
}
