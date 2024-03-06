package j15_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class C03_LocalDateTime {
    public static void main(String[] args) {
        // LocalDateTime -> yıl-ay-gun-saat-dakika-saniye datalarını tutar
        LocalDateTime lat=LocalDateTime.now();//Sistemde mevcut yıl-ay*gun-saat- dakika-saniye datalarını return eder.
        System.out.println("lat = " + lat);//2024-02-26T22:17:44.230329500
        System.out.println("lat.getSecond() = " + lat.getSecond());
        System.out.println("lat.getDayOfYear() = " + lat.getDayOfYear());
        System.out.println("lat.getMonthValue() = " + lat.getMonthValue());

        LocalDate tarih=LocalDate.of(1903,2,23);
        LocalTime saat=LocalTime.of(17,55,23);
        LocalDateTime ldt1=LocalDateTime.of(tarih,saat);
        System.out.println("ldt1 = " + ldt1);//1903-02-23T17:55:23

        LocalDateTime ldt2= ldt1.minusMonths(15).minusMinutes(100).plusDays(33).plusHours(1).minusSeconds(95);
        System.out.println("ldt2 = " + ldt2);//1901-12-26T17:13:48
        //Local DateTime variable atama yapılmazsa herhangi bir değişiklik olmaz immutable old. için

    }
}