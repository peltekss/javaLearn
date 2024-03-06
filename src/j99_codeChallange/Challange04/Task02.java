package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task02 {
    //Task-> girilen iki ayrı  kelimeyi iki farklı yol ile birlestiriniz.

    //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ilk kelime giriniz : ");
        String ilk = input.nextLine();
        System.out.println("Lütfen bir ikinci kelime giriniz : ");
        String ikinci = input.nextLine();

        System.out.println(ilk.concat(ikinci));
        System.out.println(ilk + ikinci);
        System.out.println(ilk.substring(1)+ikinci.substring(1));


    }


}
