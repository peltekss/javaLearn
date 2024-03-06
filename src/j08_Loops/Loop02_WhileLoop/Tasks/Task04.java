package j08_Loops.Loop02_WhileLoop.Tasks;

public class Task04 {

    public static void main(String[] args) {
		/*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.
		 */
        int bas = 1000;
        int sayac=0;
        while (bas > 100) {

            if (bas % 4 == 0 && bas % 6 == 0) {
                System.out.print(bas + " ");
                sayac++;
            }
            bas--;
        }
        System.out.println("\n" + sayac+ " adet 3 basamaklı 4 ve 6 ya tam bölünebilen sayı vardır.");



    }

}
