package j21_Scope;

public class C01_InstanceVariable {//class level
    static String kurs= "Clarusway";//initial edilmiş class variable oluştu
    static String prLanguage;//initial edilmemiş class variable
    int yas=49;//initial edilmiş obj variable->0
    int tecrube;//initial edilmiş obj variable->0
    String isim;//initial edilmiş obj variable->null
    boolean developer;//initial edilmiş obj variable->false
    double boy;//initial edilmiş obj variable->0.0
    char unvan;//initial edilmiş obj variable

    /*                                   INSTANCE VARIABLE

    1) Main method'un ve urettiginiz diger methodlarin disinda  (ustunde veya altinda), class'in icinde
        olusturulan variable'lara non-Static Class level "instance variable" denir.
    2) Instance variable'lar object olusturulurken olusturulur ve her obje'ye bu variable'lar monte edilir.
    3) Instance variable'lara deger atamasi yapsaniz da olur, yapmasaniz da olur.
        Asagida goruldugu gibi "yas" variable'ina deger atamasi yapıldı ama "tecrube" variable'ina yapılmadı
        Note : Bir variable'a deger atamasi yapma "Initialize" olarak adlandirilir.
            "yas" variable'i initialize edildi, digerleri initialize edilmedi.
    4) Initialize edilmeyen "instance variable" lar icin Java "default value" atamasi yapar.
                byte, short, int, long icin default value 0'dir.
                float, double --> default value 0.0'dir.
                char --> default value ' ''dir.
                boolean --> default value false'dur.
                String --> default value "null" dir.

*/

    public static void main(String[] args) {//Deneme level
        //static int kg=99;//class level haricinde Deneme veya başka bir metotta static class variable oluşturulamaz.->CTE
        int kg = 99;//initial edilmiş LOCAL vARİABLE
        int id; //initial edilmemiş LOCAL VARİABLE
        //System.out.println(id);//İnitial edilmemis local variable herhangi bir aksiyona tani tutulamaz.->CTE
        id=100;//local variable değer atandı.
        System.out.println("id scope içinde doğrudan call edildi. "+id);//value atanan variable scope içinde doğrudan aksiyona tabii tutulabilir.
        //System.out.println("yas: "+yas);//obj variable obj olmadan ca edilemez.
        prLanguage="Java";
        System.out.println("prLanguage static variable olduğu için obj olmadan doğrudan call edilebilir. "+prLanguage);
        staticMeth();//staticMeth static olduğu için doğrudan call edildi.
        //nonStaticMeth();//nonStaticMeth Deneme içinde doğrudan call edilemez.
        C01_InstanceVariable obj1=new C01_InstanceVariable();//obj create edildi.
        obj1.nonStaticMeth();//non-Static meth obj yardımıyla call edildi.
        System.out.println("obj1.boy = " + obj1.boy);//instance variable obje yardımıyla call edildi.
        System.out.println("obj1.kurs = " + obj1.kurs);//bad practice->obj yardımı ile static variable call edildi.
        //obj1.id;//local variable ile call edilemez
        System.out.println("id = " + id);


    }//Deneme sonu
    public static void staticMeth(){
        System.out.println("Static meth run edildi.");
    }
    public void nonStaticMeth(){
        System.out.println("non-Static meth run edildi.");

    }
}//class sonu
