package j15_DateTime;

import java.time.LocalTime;

public class C02_LocalTime {
    public static void main(String[] args) {
        // LocalTime  -> sadece saat-dakika-saniye datatlarını tutar(stored)
        LocalTime suAn=LocalTime.now();//Sistemde mevcut zamanı (saat, dak,ka, saniye ve salise) şeklinde verir.
        //Trick-> LocalTime oluşturulurken new keyword kullanılmaz.
        System.out.println(suAn);//22:01:32.335501600
        System.out.println(suAn.getHour());//22
        System.out.println(suAn.getMinute());//1
        System.out.println(suAn.getSecond());//32
        System.out.println(suAn.getNano());//335501600

        LocalTime saat1=LocalTime.of(9,43,21,1907);
        LocalTime saat2=LocalTime.of(9,43);
        LocalTime saat3=LocalTime.of(19,10,21);
        //Tanımlanan herhangi bir time öncesi -> plus(), sonrası-> minus() meth ile gidilir.
        System.out.println("saat1.plusMinutes(36).minusHours(12) = " + suAn.plusMinutes(36).minusHours(12));//10:44:15.505341600
        LocalTime loopStart=LocalTime.now();
        System.out.println("loopStart.getNano() = " + loopStart.getNano());
        int toplam=0;
        for (int i = 0; i <10000 ; i++) {
            toplam+=i;
        }
        LocalTime finishLoop=LocalTime.now();
        System.out.println("finishLoop.getNano() = " + finishLoop.getNano());
        System.out.println("Loop run hızı= " + (finishLoop.getNano() - loopStart.getNano()));


    }
}
