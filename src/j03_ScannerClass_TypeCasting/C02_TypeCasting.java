package j03_ScannerClass_TypeCasting;

public class C02_TypeCasting {

            /*
       Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                     byte < short < int < long < float < double
       Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
       Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.

       */

    public static void main(String[] args) {
        boolean başarılı = true;
        System.out.println("başarılı = " + başarılı);
        String succes = String.valueOf(başarılı);
        System.out.println("succes = " + succes);

        double sayı = 49;
        System.out.println("sayı = " + sayı);
        int sayı1 = 74;
        int sayı2 = 12;
        System.out.println("sayı1/sayı2 = " + sayı1 / sayı2);
        /* Java'da iki int değer bölündüğünde sonuç mutlaka int olur.
        Yani bölüm ondalıklı bir sayı da olsa casting yaparak int yapar.
        Ancak int i double böldüğünüzde double olur.
         */

        byte b=15;
        int num=b; //->b AW
        System.out.println("num = " + num);
        int i=1453;
        double d=i;
        System.out.println("d = " + d);
        double d1=d/sayı2;
        System.out.println("d1 = " + d1);

        //hap bilgi -> iki farklı data type işleme girerse AW (küçük data büyük dataya (casting) çevrilir) yapılır.
        // Veri kaybını önlemek için.

        double d2=14.53;
        System.out.println("d2 = " + d2);

        int num2= (int) d2;
        System.out.println("num2 = " + num2);//Expc. narrow -> büyük dönüştür küçüğe.

        double d3=571.622;
        System.out.println("d3 = " + d3);
        long l=(long) d3;
        System.out.println("l = " + l);

        int num3=129;
        System.out.println("num3 = " + num3);
        byte b2= (byte) num3;
        System.out.println("b2 = " + b2);


    }
}
