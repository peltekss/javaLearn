package j08_Loops.Loop01_FoorLopp;

public class C01_ForLoop {
    public static void main(String[] args) {
        //for loop-> tekrarlayan sabit actionlar için tanımlanan code bloğu'dur.
        // task->> 41 kere "Maaşallah" print eden code create ediniz.

        //  baş. start value      bitiş end valuee           value değişim
        for (int i = 0;                i < 41;                      i++) {
            System.out.println(i+1+".Maşaallah");//her tekrarda alınacak aksiyon

        }

        System.out.println("javaCanlara selam.");// for kırıldı ve devamındaki kod satırı 1 defa çalıştı.

        // task02-> 2 basamaklı tek sayıları aynı satıra aralarında boşluk ile print eden code create ediniz
        for (int i=11; i<100 ; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("\n***");
        for (int i=11; i<100 ; i++){
            if(i>=10 && i%2!=0){
                System.out.print(i+" ");
            }
        }
            /*
              Code standarts
            1) Tekrar (Repetition) olmamalidir
            2) Dynamic olmalidir
            3) Tamir (Fix) ve update kolay yapilabilmelidir
            */

    }

}
