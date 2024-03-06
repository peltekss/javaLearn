package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task35 {
    public static void main(String[] args) {

        // verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusturun
        // Fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........

        fibonaccidenSayiYazdir(16);
    }

    public static void fibonaccidenSayiYazdir(int adet) {
        int sayı1=0; int sayı2=1;
        for (int i = 0; i <= adet; i++) {
            System.out.print(sayı1 + " ");

            int toplam = sayı1+sayı2;
            sayı1 = sayı2;
            sayı2 = toplam;
        }



    }
}
