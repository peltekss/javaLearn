package j20_StaticKeyword.Tasks.Task02;

public class Runner {
    /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int),
    oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e
    toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura
    değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası
    print eden code create ediniz

     */


    public static void main(String[] args) {
        Musteri obj = new Musteri();
        obj.name = "Sema Hanım";
        ElektrikHesabi hesap = new ElektrikHesabi();
        obj.elektrikHesabi=hesap;
        obj.elektrikHesabi.tuketimEkle(100);
        obj.elektrikHesabi.tuketimEkle(150);
        System.out.println("obj.elektrikHesabi.toplamTuketim = " + obj.elektrikHesabi.toplamTuketim);
        System.out.println("obj.elektrikHesabi.ödenecekTutar() = " + obj.elektrikHesabi.ödenecekTutar());
        System.out.println("obj.elektrikHesabi.fatura = " + obj.elektrikHesabi.fatura);

        Musteri obj2=new Musteri();
        obj2.name = "Safvet Bey";
        obj2.elektrikHesabi=new ElektrikHesabi();
        obj2.elektrikHesabi.tuketimEkle(250);
        obj2.elektrikHesabi.tuketimEkle(300);
        obj2.elektrikHesabi.ödenecekTutar();
        System.out.println("obj2 = " + obj2);

    }


}
