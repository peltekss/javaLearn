package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C07_DateTimeException {
    public static void main(String[] args) {
        //DateTimeException -> tarih zaman value'lerde oluşan RTE
        try{
            LocalDate date = LocalDate.of(2023,2,29);
            System.out.println("Bu mesajı okuyorsan try çalıştı, catch çalışmadı");
        }catch(DateTimeException e){
            System.out.println(e.getMessage()+" try exc fırlattı catch yakaladı");
        }
        System.out.println("Bu mesajjı okuyorsan app sorunsuz çalıştı.");

    }
}

