package j11_Arrays;

import java.util.Arrays;

public class C03_Arrays_BinarySearch {
    public static void main(String[] args) {
        // Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu
        int sayiArr[] = {23, 44, 2, 11, 55, 60, 32, 34, 58, 22, 9, 64, 42};
        int sayi1 = 44;
        int sayi2 = 20;
        System.out.println("Uzun Yol");
        boolean flag = false;
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] == sayi2) {
                System.out.println(sayiArr[i]);
                flag = true;
                break;
            }
        }
        System.out.println(flag?"aradığınız sayı arrayde mevcut":"aradığınız sayı arrayde mevcut değil");

        System.out.println("Pratiik Kod");
        Arrays.sort(sayiArr);//sort işlemi yapıldı->küçükten büyüğe sıralandı.
        System.out.println("Arrays.binarySearch(sayiArr,sayi2) = " + Arrays.toString(sayiArr));
        System.out.println("Arrayde 20 nin varlığı: " +Arrays.binarySearch(sayiArr,sayi2));
        System.out.println("Arrayde 44 nin varlığı: " +Arrays.binarySearch(sayiArr,sayi1));
    }
}
