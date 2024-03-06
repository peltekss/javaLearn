package j07_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
        */

        String qa="Saim Team Lead";
        System.out.println("qa = " + qa);
        System.out.println("qa.charAt(5) = " + qa.charAt(5));
        char yedinciKarakter=qa.charAt(7);
        System.out.println("yedinciKarakter = " + yedinciKarakter);
        //son karakter indexi = str.length8)-1
        //metnimizin uzunluğundan fazla bir index girersek Java bize RTE hatası verir. -> StringIndexOutOfBoundsException.

        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir metin giriniz: ");
        String metin = scan.nextLine();
        if (metin.length()%2==0){
            System.out.println("Girilen metnin ortası yoktur.");
        }else System.out.println(metin.charAt(metin.length() / 2));
    }
}
