package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        List<Integer> sayıList= new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Listeye atmak istediğiniz elemanları giriniz\nyeterli sayıya ulaşınca negatif bir sayı giriniz");
        int islem=0;
        int toplam=0;
        while(islem>=0) {
            System.out.println("sayı giriniz");
            islem= scan.nextInt();
            if(islem>0) {
                sayıList.add(islem);
                toplam += islem;
            }

        }
        System.out.println("sayıList = " + sayıList);
        System.out.println("toplam = " + toplam);
        int ort=toplam/sayıList.size();
        System.out.println("ort = " + ort);
        for (int i = 0; i < sayıList.size(); i++) {
            if (sayıList.get(i)>ort){
                System.out.println(sayıList.get(i)+" ");
            }

        }




    }


}
