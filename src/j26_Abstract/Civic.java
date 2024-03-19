package j26_Abstract;

public class Civic extends Lastik{//concrete child class
    /*
    extends Honda yazılarak Honda Class'a concrete bir Civic class tanımlandı
    java CTE verdi
    çözüm:
    a) Unımplemented (uyarlanmamış) method implement edilmeli
    b)parent Honda class'dan abstarct keyword kaldırılmalı
    c)concrete olan child Civic class abstract tanımlanmalı
  */


    //concrete child Class abs. meth tanımlanır mı? nayır nolamazzzz
    //public  abstract void absMeth();
    // TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli

    @Override
    public void motor() {
        System.out.println("1.6 motor neyine yetmiyor");
    }

    @Override
    void koltuk() {
        System.out.println("Biraz ucuza kacip kumas koltuk mu yaptirdin");
    }

    @Override
    void kapi() {
        System.out.println("Yavas kapat elinde kalmasin");
    }

    @Override
    public void lastikEbat() {
        System.out.println("18'' lastik kafi");
    }
    //Polymorphisim -> obj cok bicimlilik(fakli data type ve farkli const)
//    Civic obj=new Civic();//Civic concrete child class data type obj
//    Honda obj1=new Civic();//Honda abs class data type obj


}
