package j20_StaticKeyword;

public class C03_StaticKeyword {
    int ogrId;//İnst(obj) variable
    static int ogrSayısı;//static (class) variable

    public C03_StaticKeyword() {//psiz const
        ogrSayısı++;//bu const call edildiğinde yani obje oluşturulduğunda(create)
        //ogrSayısı static variable kalıcı (her obj için aynı değer) olarak arttırılır.
        ogrId++;//bu const call edildiğinde yani obje oluşturulduğunda(create)
        //ogrId create edilen obj'ye özel değer alır.
    }

    public static void main(String[] args) {
        System.out.println("a obj öncesi ogrSayısı: " +ogrSayısı);
        C03_StaticKeyword a= new C03_StaticKeyword();
        System.out.println("a obj sonrası ogrSayısı: " +ogrSayısı);
        C03_StaticKeyword b= new C03_StaticKeyword();
        C03_StaticKeyword c= new C03_StaticKeyword();
        C03_StaticKeyword d= new C03_StaticKeyword();
        System.out.println("a, b, c, d, objeleri sonrası ogrSayısı: " +ogrSayısı);

        C03_StaticKeyword e;// obje decleration ama assaingment yapılmamış-> yani const call yok.
        System.out.println("e obj sonrası ogrSayısı: " +ogrSayısı);
        System.out.println("a ogrId: "+a.ogrId );
        System.out.println("b ogrId: "+b.ogrId );
        System.out.println("c ogrId: "+c.ogrId );
        System.out.println("d ogrId: "+d.ogrId );
        //System.out.println("e.ogrId = " + e.ogrId);


    }
}
