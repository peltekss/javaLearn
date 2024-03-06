package j02_DataTypea_WrapperClass;

public class C01_VariableCreate {
    /*Variable
 bellekte (memory) ayrilmis olan alanin (reserved area) adidir.
 Variable icinde deger saklayan bir container'dir
 bir variable oluştururken içerisine koyacağimiz datanın değer alabileceği değerlere uygun bir data türü seçmeliyiz
örneğin bir okulun öğrenci sayısı için variable data türü String,boolean,char veya double alınmamalı.
geriye kalan tamsayı  turlerınden okulun öğrenci sayısını içine alabilecek büyüklükte bir data turu secilir
*** genelde tam sayılar için int ondalıklı sayılar için double kullınılır..
*/
    public static void main(String[] args) {

        //variable create(değişken olluşturmak) için..
        //1-Data Type (değişken türü)       2-Variable name (değişken ismi)  '=' 3-Value(değişkenin değeri);
            int                             selimYas                         =      35;//memory'de int tipinde selimYas isminde 35 değerinde bir variable oluşturuldu.

        //1.Yol -> best practice (Recommended ->Tavsiye edilen)
        int yas =33;
        int maas=100000;
        System.out.println(yas);
        System.out.println(maas);
        System.out.println("selimYas = " + selimYas);

        //2.Yol
        int boy;// int data type boy adında bir variable tanımlandı->declaration
        //System.out.println(boy);
        boy=190;//öncesinden declaratition variableye değer ataması yapıldı(assigment)
        System.out.println(boy);

        //3.Yol
        int yevmiye,kilo,tecrübe;//birden çok aynı türdee variable tanımlandı =>declaration
        yevmiye=400;//öncesinden declaratition variableye değer ataması yapıldı(assigment)
        kilo=90;
        tecrübe=7;

        //cincix kod
        int günlük=550, ağırlık=88, experience=10;
        System.out.println("günlük= "+günlük+ " ağırlık=" +ağırlık+ " experience=" +experience);


        //hata-> öncesinden tanımlamış bir variable tekrar tanımlanamaz.  -> CTE
        //int yas=58; //CTE hatası -> already exists daha önce tanımlanmış.
        yas=58; // tanımlanmış olan bir variable yeniden değer ataması yapıldı -> değer değişti.

    }

}
