package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */


    public static void main(String[] args) {
        ArrayList<String> gunler=new ArrayList<>(List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi", "Pazar"));
        ArrayList<Double>gunlukKazanclar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int günSayacı = 1;
        while (günSayacı <= 7){
            System.out.println("Günlük Kazançlarını Giriniz");
            double kazanc = scanner.nextInt();
            gunlukKazanclar.add(kazanc);
            günSayacı++;
        }
        double ortalamaKazanc= getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Ortalama Kazancı : "+ortalamaKazanc);
        ArrayList<String> ustundeKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalamanın Üstünde Kazanç Günleri: " + ustundeKazancGunleri);
        ArrayList<String> altindaKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalamanın Altında Kazanç Günleri: " + altindaKazancGunleri);
    }

    private static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalamaKazanc) {
        ArrayList<String> altindaKazancGunleri = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < ortalamaKazanc) {
                altindaKazancGunleri.add(gunler.get(i));
            }
        }
        return altindaKazancGunleri;
    }

    private static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalamaKazanc) {
        ArrayList<String> ustundeKazancGunleri = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalamaKazanc) {
                ustundeKazancGunleri.add(gunler.get(i));
            }
        }
        return ustundeKazancGunleri;
    }

    private static double getOrtalamaKazanc(ArrayList<Double> gunlukKazanclar) {
        double toplam = 0;
        for (double kazanc : gunlukKazanclar) {
            toplam += kazanc;
        }
        return toplam / gunlukKazanclar.size();
        
    }

}
