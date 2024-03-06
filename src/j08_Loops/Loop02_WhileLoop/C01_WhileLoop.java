package j08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
      Başlangıç bitiş ve değişim değerleri net  bilinen tekrarlarda for loop ama adım sayısı değişim değeri
      net bilinmeyen belli bir şarta(durum-boolean) bağlı olan tekrarlara while loop kullanılır.
       */

        //Task01-> 3'den 20'ye kadar olan tamsayıları print eden code create ediniz.
        System.out.println("***for ile**");
        for (int i = 3; i <=20 ; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("***while ile***");
        int sayı = 3;//While Loop'un başlangıç değeri tanımlandı.
        while(sayı<=20){//sayı 20'den küçük eşitse olduğu sürece loop devam edecek
            System.out.print(sayı+" ");
            sayı++;//While loop şartı için değişim komutu tanımlandı.
        }

        // task02-> 7 kere javaCAN print eden code create ediniz
        System.out.println();
        int i =1;
        while(i<=7){
            System.out.print(i+"javaCAn ");
            i++;
        }
        System.out.println();
        for (int j = 0; j <7 ; j++) {
            System.out.print("javaCan ");

        }
        System.out.println();
        // task03->2 basamaklı tek sayıları print eden code create ediniz
        int t=11;
        while (t<=99){
            System.out.print(t+" ");
            t+=2;
        }
        System.out.println();
        // task04->girilen ifadeyi tersten  print eden code create ediniz
        Scanner scn=new Scanner(System.in);
//        System.out.println("Lütfen bir metin giriniz");
//        String metin=scn.nextLine();
//        int harfSayısı=metin.length();
//        while(harfSayısı>0){
//            System.out.print(metin.charAt(harfSayısı-1));
//            harfSayısı--;
//        }
        //task05->girilen pozitif  tamsayıya kadar sayıların toplamını  print eden code create ediniz
        System.out.println("Pozitif bir tam sayı giriniz.");
        int sayı1=scn.nextInt();
        int toplam=0;
        int start=1;
        if (sayı1>=0){
            while(start<=sayı1){
                toplam+=start;
                start++;
            }

        }else System.out.println("Pozitif bir sayı giriniz.");
        System.out.println(toplam);

        // task06->girilen tamsayının faktöriyelini  print eden code create ediniz

        System.out.println("Bir sayı giriniz.");
        int sayı2=scn.nextInt();
        int faktor=1;
        while(sayı2>1){
            faktor*=sayı2;
            sayı2--;
        }
        System.out.println("faktöriyel "+faktor);
    }

}
