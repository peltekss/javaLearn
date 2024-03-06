package j08_Loops.Loop03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
/*
        While loop-> önce sart konrol edilir eğer  sart sonucu true alınırsa body action çalışır
        do-While loop-> önce body action çalışır sonra şart kontrol edilir.Sart true ise loop devam eder.
        sart false ise loop kırılır ve loopdan sonraki ilk satır çalışır.
        do-While loop->  game app. de daha çok kullanılır.
        Trick: while loop sart sağlanmazsa hiç çaılşmayabilir ama do-while sart sağalasın sağlamasın
        en az bir kez çalışır..

        While-loop body'si icindeki kodun hic calistirilmama ihtimali vardir.
        zero execution mumkundur
        do-while loop'un body'si icindeki kod en az bir kere calisir.
        zero execution mumkun degildir

        While loop'un 2 tane negatif yonu vardir
        1- loop'dan once olusturdugumuz ve loop'da kullanacagimiz variable'lara
        yanlis bir deger verirsek, loop bodys'si hic calismayabilir
        2- loop condition'i loop body'sinden bir kez fazla calisir
        bu negatif yonler onu kullanilmaz yapacak buyuklukte degildir
        ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz

         */

        int yas = 28;
        while (yas>40) {
            System.out.println("Seher Hanım " + yas + "sdet team lead. Hayırlı olsun while body çalıştı.");
            yas++;
        }
//        while (yas < 40) {
//            System.out.println("Seher Hanım " + yas + "sdet team lead. Hayırlı olsun while body çalıştı.");
//            yas++;
//        }
//        do {
//            System.out.println("Seher Hanım " + yas + "sdet team lead. Hayırlı olsun do-while body çalıştı.");
//            yas++;
//        } while (40 > 0);

    }
}