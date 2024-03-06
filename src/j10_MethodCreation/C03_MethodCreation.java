package j10_MethodCreation;

import static j10_MethodCreation.C03_MethodDepo.gecmeNotu;

public class C03_MethodCreation {
    public static void main(String[] args) {//main level -> benim köyüm
        String hlt = "en hakiki javaci";
        String sema = "javaNAZZZ";
        selamVer();//tanımlandığı class scopta method name ile direct call edilebilir.
        System.out.println("hlt = " + hlt);
        System.out.println("sema = " + sema);
        /*Farklı classlardan method call eetmek için clasName.methodName ile ya da class import edilerek call işlemi yapılır.
        static method olarak call edilir -> gökteki güneş gibi.
        Aynı classta method doğrudan name ile call edilir.
        */
        C03_MethodDepo.gecmeNotu(88);//Calss name ile meth call edildi-> komşu köyün çalışanı öyün ismi ile çağrıldı.
        gecmeNotu(43);//import edildi->komşu köyün işçisi gökteki güneş gibi parladı.
    }

    private static void selamVer() {//Köyümün çalışanı
        System.out.println("Beni köyümün yağmurlarında yıkasınlar");
        gecmeNotu(55);//main dışına farklı method içine call edildi.
    }
    //gecmeNotu(66);method dışına ama meth call işlemi olmaz
}
