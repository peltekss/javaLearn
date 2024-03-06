package j15_DateTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {
    public static void main(String[] args) {
        // LocalDate  -> sadece gun-ay-yıl datatlarını tutar(stored)
        LocalDate today = LocalDate.now();
        //Trick -> LocalDate variable için new keyword kullanılmaz-> kullanılırsa CTE hatası verir.
        System.out.println("today = " + today);//2024-02-26
        System.out.println("today.getYear() = " + today.getYear());//2024
        System.out.println("today.getMonth() = " + today.getMonth());//FEBRUARY
        System.out.println("today.getDayOfMonth() = " + today.getDayOfMonth());//26
        System.out.println("today.getDayOfWeek() = " + today.getDayOfWeek());//MONDAY
        System.out.println("today.getDayOfYear() = " + today.getDayOfYear());//57
        System.out.println("today.getMonthValue() = " + today.getMonthValue());//2

        System.out.println("****");
        LocalDate tarih1=LocalDate.of(1974, 05, 22);
        LocalDate tarih2= LocalDate.of(1985, Month.MARCH,12);
        //Tanımlanan tarihin öncesi minus() -> sonrasında ise plus() meth. kullanılır.
        System.out.println(tarih1);//1974-05-22
        System.out.println(tarih1.minusYears(34).plusMonths(34).plusDays(34));//1943-04-25
        System.out.println(tarih1);//1974-05-22
    }
}
