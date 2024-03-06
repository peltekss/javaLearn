package j19_Constructor;

public class C05_Arac {
    //fields -> obj. variable->instance variable
    String model;
    int maxHiz;

    public C05_Arac() {
        System.out.println("bu yazıyı okuyorsanız p'siz const run oldu");
    }
    public C05_Arac(String model) {
        this("Hacı Murat",123);//full p'li const call edildi.
        // this();//p'siz const 2. satırda olg için call edilemedi->CTE
            /*
            1) Constructor icinden baska bir Constructor call  icin "this()" kullanılır.
            this() keyword mutlaka constructor body'nin ilk satirına yazılmalı
            Aksi takdirde CTE verir
            2) Bir Constructor icinden sadece bir tane Constructor call  yapılır.Cunku birden cok const. call edilirse
            birisi ilk satirda olamayacaktir, bu da ilk kuralla celisir.
            */
        this.model = model;
        System.out.println("bu yazıyı okuyorsanız bir p'li const run oldu");

    }
    public C05_Arac(String model, int maxHiz) {//full p'li const
        this();//p'siz cons call edildi->const call mutlaka body'nin ilk satırında olmalı yoksa CTE
        this.model = model;
        this.maxHiz = maxHiz;
        System.out.println("bu yazıyı okuyorsanız iki p'li const run oldu");
    }

    @Override
    public String toString() {
        return
                "model='" + model + '\'' +
                ", maxHiz=" + maxHiz ;
    }
}
