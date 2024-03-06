package j14_Varargs;

public class C01_Varargs {
    public static void main(String[] args) {
         /*
        VARARGS :diva...  :)
        var----variety: cesitlilik args---arguments
        SYNTAX ->
        mathodName(parametre1,parametre2, dataType... dataName) {
        method body....

        }

	        1) Method parametre parantezi icinde birden çok parametre varsa, varargs daima en sona tanımlanmalıdır .CISSS -> Diva en son sahne alır
		    2) Method parametre parantezi icinde 1'den fazla varargs ifade TANIM-LA-NA-MAZZZ :CISS -> diva tek olur.iki diva bir ipte yurumez

           Gunun TRICK'i  köşesinde böyün :
           Method'da  argument sayisi sabitse standart normal  method tanımlanmalı..
           ancak argument sayisi belirli değilse  VARARGS ifade tercih edilmeli...
  */

        int sayi1=15;
        int sayi2=34;
        int sayi3=59;
        int sayi4=38;
        // task01-> verilen 2 int variable toplamını print eden METHOD create ediniz..
        System.out.println("***Task 01***");
        topla(sayi1,sayi2);//49
        topla(sayi2,sayi4);//72
        topla(99,sayi3);//158

        // task02-> verilen 3 int variable toplamını print eden METHOD create ediniz..
        System.out.println("   ***  task02   ***   ");
        topla(sayi1,sayi3,135);//209
        topla(571,sayi4,1);//610
        topla(1907,4,sayi2);//1945

        // task03-> verilen 5 int variable toplamını print eden METHOD create ediniz.
        System.out.println("   ***  task03   ***   ");
        topla(3,6,sayi1,34,sayi4);//96
        topla(2,3);//varargs olmayan meth. call edildi//5
        topla(2,6,7,sayi1,89,99,123,45,5,78,76);//545

        // task04-> .verilen String variable'rın  en fazla karakter bulunduranı  print eden METHOD create ediniz..
        System.out.println("   ***  task04   ***   ");
        enUzunKelime("JavaZADE","JavvvaNUR","JavaCAN");//JavvvaNUR
        enUzunKelime("Enes","Ahmet","Halit","Abdurrahman","Semra Yaren hanim");//Semra Yaren hanim
    }

    private static void enUzunKelime(String... str) {//diva->varargs meth.
        String uzunStr="";
        for (String each:str){
            if (uzunStr.length()<each.length()){
                uzunStr=each;
            }
        }
        System.out.println("uzun kelime = " + uzunStr);
    }

    private static void topla(int... i) {//diva-> cok p'li varargs meth.
        int toplam=0;
        for (int avuc:i){
            toplam+=avuc;
        }
        System.out.println("girilen sayilarin toplam = " + toplam);
    }

    private static void topla(int num1, int num2, int num3) {//3p'li meth
        System.out.println("Elemanlarin toplami : "+(num1+num2+num3));
    }

    private static void topla(int num1, int num2) {//2p'li meth
        System.out.println("Elemanlarin toplami : "+(num1+num2));
    }
}
