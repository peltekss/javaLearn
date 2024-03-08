package j23_Encapsulation.encapsulation2;

public class KisiRunner {
    public static void main(String[] args) {
        Kisi obj1=new Kisi("Aydin","Bahtiyar","123asd",-34);
        System.out.println("obj1 = " + obj1);
        System.out.println("obj1.getAd() = " + obj1.getAd());//Aydin
        System.out.println("obj1.getPassword() = " + obj1.getPassword());//123asd
        System.out.println("obj1.getSoyad() = " + obj1.getSoyad());//Bahtiyar
        System.out.println("obj1.getYas() = " + obj1.getYas());//34
        obj1.setAd("Sema");
        System.out.println("obj1.getAd() = " + obj1.getAd());//Sema

    }
}
