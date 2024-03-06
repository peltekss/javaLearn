package j02_DataTypea_WrapperClass;

public class C04_WrapperClass {

    /*
Note: Java primitive lere method'lar ekleyerek yeni bir
     yapi olusturdu, bu yapiya "Wrapper Class"
     Primitive         Wrapper
        byte     ==>    Byte
        short    ==>    Short
        ** int   ==>    Integer
        long     ==>    Long
        float    ==>    Float
        double   ==>    Double
        boolean  ==>    Boolean
        ** char  ==>    Character
*/

    public static void main(String[] args) {
/*

Java'da bir değişkenin data type için getClass() methodu kullanılır. Bu method o nesne(obj)
hangi class'tan üretildiyse onu verir.
 */
        String str= "JavaCan";
        int yas=45;
        double pi=3.14;
        System.out.println(str.getClass());
        //System.out.println(yas.getClass()); //CTE -< YAS PRİMİTİVE OLD. İÇİN CLASSI YOKTUR.
        //System.out.println(pi.getClass()); //CTE -> YAS PRİMİTİVE OLD. İÇİN CLASSI YOKTUR.

        /*
        Integer.valueOf(yas) Double.valueOf(pi) ifadeleri kullanırsak ilkel veri tipleri Wrapper classa dönüştürülür.
        getClass meth. kullanılabilir.

         */

        String isim="Safvet";
        System.out.println("isim = " + isim);
        System.out.println("isim.toUpperCase() = " + isim.toUpperCase());

        /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
ancak primitive data turlerinin boyle bir ozelligi yoktur
primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
ara çözüm imkanı sunmuştur.
         */

        // task-> id ve tc String değerlerini toplamını print code create ediniz..
        String id="4545";
        String tc="32432434";
        System.out.println(id+tc); //454532432434
        Integer yeniID=Integer.valueOf(id); //String olan Id integer'a çevrildi.
        System.out.println("yeniID = " + yeniID);
        Integer yeniTC=Integer.valueOf(tc); //String olan Id integer'a çevrildi.
        System.out.println("yeniTC = " + yeniTC);
        System.out.println("Toplam = "+ (yeniID+yeniTC));

        String okulNo="3435a";
        //int ookulNosu3435a CTE HATASI
//        int yeniOkulno=Integer.parseInt(okulNo); okulNo integere atandı -> Run time Exception
//        System.out.println(yeniOkulno);

        // task-> byte short int data type max ve min değerlerini print eden code create ediniz.

        Byte maxByte=Byte.MAX_VALUE;
        Byte minByte=Byte.MIN_VALUE;
        Short maxShort=Short.MAX_VALUE;
        Short minShort=Short.MIN_VALUE;
        int maxInt=Integer.MAX_VALUE;
        int minInt=Integer.MIN_VALUE;

        System.out.println("maxByte = " + maxByte);
        System.out.println("minByte = " + minByte);
        System.out.println("maxShort = " + maxShort);
        System.out.println("minShort = " + minShort);
        System.out.println("maxInt = " + maxInt);
        System.out.println("minInt = " + minInt);


    }
}
