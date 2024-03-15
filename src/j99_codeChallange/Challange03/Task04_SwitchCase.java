package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task04_SwitchCase {
    /*
    switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
	switch() de int, byte, short, char, String kullanilir.
     */
 /*  Task->
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gün giriniz.");
        String gün = scan.nextLine().toLowerCase();
        switch (gün) {
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi gunleri");
                break;
            case "çarsamba":
            case "cumartesi":
                System.out.println("SQL dersi");
                break;
            default:
                System.out.println("Izin gunu");
                break;
        }

    }// Deneme sonu
}