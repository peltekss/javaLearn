package j10_MethodCreation;

public class C03_MethodDepo {
    //her classta Deneme meth. tanimlama zorunlulugu yoktur.Belirli acsiyonlar icin ozel classlar tanimlanir

    public static void gecmeNotu(int not){
        if (not>=85){
            System.out.println("TAKDIR belgesi kazandiniz");
        } else if (not>=70) {
            System.out.println("TESEKKUR belgesi kazandiniz");
        } else if (not>=50) {
            System.out.println("Tekrar dene");
        }else {
            System.out.println("MEB izin vermese sinifi da gecemezdin");
        }
    }
}
