package j11_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    /*
     Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
     Array tanımlamak için:
     1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
     2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

     Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
     isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
    */
    public static void main(String[] args) {
        //Array decleration
        int a;//declere edilen fakat atama yapılmayan bir variable tanımlandı.
        int arr[]; //declere edilen fakat atama yapılmayan bir non-primitive int type array tanımlandı
        //Trick -> tanımlanan ancak değer atanmayan bir aaray hiçbir actiona tabi tutulamaz ->CTE
        String[] isimler={"Saim","Halid", "Safvet", "Abdurrahman", "Yücel", "Sema"};//hem declere işlemi hem de atama işlemi yapılan String type array tanımlandı.
        int sayiArr[]=new int[5];//eleman sayısı tanımlanmış boş int type array
        int sayiArr1[]=new int[7];//eleman sayısı tanımlanmış boş int type array
        //Array'e eleman girişi->update
        sayiArr[3]=61;//3. index eleman 61 olarak update edildi.
        sayiArr[4]=58;
        sayiArr[0]=55;
        sayiArr[3]=58;//3.index eleman 61 iken 58 olarak değiştirildi: arrayin elemanları unique olmak zorunda değildir.
        //Arrayin eleman sayısı->length
        System.out.println(sayiArr.length);//5
        System.out.println("isimler.length= " + isimler.length);//6
        //Arrayi print etme
        System.out.println("isimler = " + isimler);//[Ljava.lang.String;@5315b42e
        System.out.println("sayiArr = " + sayiArr);//[I@5d624da6
        //sout(arr)-> Array non-primitive olduğu için bu şekilde print etme bize referans değeri verir.
        //sout(Arrays.toString(arr)); bu şkeilde array elemanları print edilir.
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));
        //System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr)); ->CTE
        System.out.println("Arrays.toString(sayiArr1) = " + Arrays.toString(sayiArr1));//[0, 0, 0, 0, 0, 0, 0]
        //Arrayin son index elemanını print etme
        System.out.println("sayiArr[sayiArr.length-1] = " + sayiArr[sayiArr.length-1]);//58
        System.out.println("ilk index eleman = " + sayiArr[0]);//55
        //Arrayde olmayan index eleman yazdırma
        //System.out.println("sayiArr = " + sayiArr[42]);->RTE

        //Arrayin elemanlarını print etme-> bad practice
        System.out.println("Arrays.toString(isimler) = " + Arrays.toString(isimler));//array elemanları sayısı kadar tekrar tanımlandı
        for (int i = 0; i <isimler.length ; i++) {
            System.out.print(isimler[i] + " ");//tekrardan alınan her bir array elemanı print edildi->Saim Halid Safvet Abdurrahman Yücel Sema
        }
        System.out.println();

        //Arrrayi natural(doğal) sıralama alfabetik veya küçükten büyüğe
        System.out.println("Sort öncesi isimler arr: "+ Arrays.toString(isimler));//Sort öncesi isimler arr: [Saim, Halid, Safvet, Abdurrahman, Yücel, Sema]
        Arrays.sort(isimler);
        System.out.println("Sort sonrası isimler arr: "+ Arrays.toString(isimler));//Sort sonucu isimler arr: [Abdurrahman, Halid, Safvet, Saim, Sema, Yücel]

        System.out.println("Sort öncesi sayiArr: "+ Arrays.toString(sayiArr));//[55, 0, 0, 58, 58]
        Arrays.sort(sayiArr);//sort sıralama yapıldı
        System.out.println("Sort sonrası sayiArr: "+ Arrays.toString(sayiArr));//[0, 0, 55, 58, 58]



    }
}
