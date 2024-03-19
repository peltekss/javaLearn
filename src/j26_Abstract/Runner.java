package j26_Abstract;

public class Runner {
    public static void main(String[] args) {
        Civic c1=new Civic();
        c1.motor();//1.6 motor neyine yetmiyor
        c1.kapi();//Yavas kapat elinde kalmasin
        c1.koltuk();//Biraz ucuza kacip kumas koltuk mu yaptirdin
        c1.sunroof();//Honda concrete meth call edildi
        c1.lastikEbat();//18'' lastik kafi
        c1.name="Enes Bey";
        System.out.println("c1.name = " + c1.name);//Enes Bey

        Accord c2=new Accord();
        c2.motor();//2.0 motor cok kacar
        System.out.println("c2.name = " + c2.name);//Ahmet Bey
        c2.koltuk();//Deri koltuk pek lux olmus
        c2.kapi();//4 kapili arabalar guzel duruyor
        c2.sunroof();//Sigara yakmak icin sunroof taktirdin degil mi?

        Crv c3=new Crv();
        c3.name="Seher Hanim";
        System.out.println("c3.name = " + c3.name);//Seher Hanim
        c3.motor();//2.4 motor cok yakmaz mi
        c3.kapi();//Himmet abi bana 3 kapili araba alacan mi?
        c3.koltuk();//Deri koltu yaz aylarinda terletir
        c3.sunroof();//Sunroof olmadan lux olmaz

    }
}
