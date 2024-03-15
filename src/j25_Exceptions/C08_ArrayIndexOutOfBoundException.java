package j25_Exceptions;

import java.time.DateTimeException;
import java.time.LocalDate;

public class C08_ArrayIndexOutOfBoundException {
    public static void main(String[] args) {
        int[] sayi = {38,33,61,59,10,16,15};
        System.out.println(sayi[5]);
        //System.out.println("sayi[21] = " + sayi[21]);//RTE->ArrayIndexOutOfBoundsException
        try{
            System.out.println("sayi[21] = " + sayi[21]);//RTE exc fırlatır alt satıra geçmeden catch blok çalışır
            System.out.println("Bu mesajı okuyorsan try çalıştı, catch çalışmadı");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Olmayan eleman istersen try exc. fırlatır catch de exc yakalar.");
        }
        System.out.println("Bu mesajjı okuyorsan app sorunsuz çalıştı.");
    }
}
