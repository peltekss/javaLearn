package j11_Arrays;

import java.util.Arrays;

public class C02_ArraysPractice {
    public static void main(String[] args) {
        String[] isimler={"Saim","Halid", "Safvet", "Abdurrahman", "Yücel", "Sema"};
        int sayiArr[]={20, 32, 7, 58, 63, 59, 35, 17, 16, 21};
        //Task01-> sayıArr cift index elemanlarını print eden code create ediniz...
        System.out.println("***Task 01***");
//        for (int i = 0; i < sayiArr.length; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i+ ". index eleman : "+ sayiArr[i]);
//            }
//        }
        for (int i =0; i < sayiArr.length; i+=2) {
            System.out.println(i+ ". index eleman : "+ sayiArr[i]);
        }
        //Task02-> isimArray de 5 karakterden fazla olan elemanları print eden code create ediniz...

        System.out.println("***Task 02***");
        for (int i = 0; i < isimler.length; i++) {
            if (isimler[i].length() > 5) {
                System.out.println(isimler[i]+" ");
            }
        }
        //Task03-> isimArray de 6 karakterden az olan elemanı depolayan(store eden) arrayı print eden code create ediniz..
        System.out.println("***Task 03***");
        String[] isimArray = new String[sayiArr.length];
        int yeniArrElemanSayısı=0;
        for (int i = 0; i < isimArray.length; i++) {//isimler array elemanı kadar loop tanımlandı
            if (isimArray[i].length() < 6) {//looptan gelen her array elemanının karakter sayısı kontrol edildi
                yeniArrElemanSayısı++;//6 karakterden az olan eleman sayısı kadar yeniArrElemanSayısı arttırıldı
            }
        }
        System.out.println("yeniArrElemanSayısı = " + yeniArrElemanSayısı);
        String [] yeniArr= new String[yeniArrElemanSayısı];
        int yeniIndex=0;
        for (int i = 0; i <isimler.length ; i++) {
            if (isimler[i].length()<6){
                yeniArr[i] =isimler[i];
                yeniIndex++;
            }
            System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
        }

    }
}
