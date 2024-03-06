package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;


public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.

        */
        // Kullanıcıdan 6 haneli bir sayıyı almak için Scanner oluşturma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen 6 haneli bir sayı giriniz:");
        int number = scanner.nextInt();

        // Tek rakamları içeren ArrayList'i almak için metod çağrısı
        ArrayList<Integer> tekRakamlar = getTekRakamlar(number);

        // Tek rakamları yazdırma
        System.out.println("Tek rakamlar:");
        for (int rakam : tekRakamlar) {
            System.out.println(rakam);
        }
    }

    // Tek rakamları içeren ArrayList'i döndüren metod
    public static ArrayList<Integer> getTekRakamlar(int number) {
        ArrayList<Integer> tekRakamlar = new ArrayList<>();
        while (number > 0) {
            int rakam = number % 10;
            if (rakam % 2 != 0) {
                tekRakamlar.add(rakam);
            }
            number /= 10;
        }
        return tekRakamlar;

    }
}