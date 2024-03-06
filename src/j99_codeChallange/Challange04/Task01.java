package j99_codeChallange.Challange04;

import java.util.Scanner;

public class Task01 {

    //Task-> Girilen ismini ve soyisimi  buyuk harfler ile print eden code create ediniz.

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir isim giriniz: ");
        String isim = scn.nextLine();
        System.out.println("Lütfen bir soyisim giriniz: ");
        String soyisim = scn.nextLine();
        System.out.println(isim.toUpperCase()+" "+soyisim.toUpperCase());



    }

}
