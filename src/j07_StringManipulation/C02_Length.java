package j07_StringManipulation;

public class C02_Length {

    /*
    length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
    butun karakterleri(boşluk vs) sayıp adedini verir.
    */

    public static void main(String[] args) {
        String str1= "Hayattan bir saat çalmak :)";
        System.out.println("str1.length() = " + str1.length());
        String str2=" ";//Tek binalı arsa
        String str3="";//Boş arsa
        String str4=null;//Dutluk
        System.out.println("str2.length() = " + str2.length());
        System.out.println("str3.length() = " + str3.length());
        //System.out.println("str4.length() = " + str4.length());//RTE -> para var ama ekmek yok.
        /*
        Hap Bilgi-> null atanan String variable herhangi bir meth call etmez.
        null->case sensitive NULL != null != Null
        null -> dutluktur. Arsa değeri olmayan arazi. Sadece hiçliği gösteren pointer.

         */

        String str5;// Tanımlanmış ama değer atanmamış boş variable kut
        //System.out.println("str5 = " + str5); CTE -> değer atanmamış variable hiç bir aksiyona tabi tutulmaz.

    }
}
