package j99_codeChallange.Challange06;

import java.util.Scanner;

public class Task09_HarfSay {
    /* Task-> Girilen bir metinde istenen bir harfin tekrar sayısını print eden code create ediniz

     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e

     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Cumle giriniz: ");
        String cumle = input.nextLine();
        System.out.println("Hangi harfi istiyorsunuz.");
        char istenenHarf = input.next().charAt(0);
        int harfSayısı = 0;
        for (int i = 0; i < cumle.length(); i++) {// girilene metin karakteri kadar loop tanımladık
            if (istenenHarf == cumle.charAt(i)) {//loop dan gelen karakter istenen harfe eşitliği kontrol edildi
                harfSayısı++;
            }
        }
        System.out.println("Girilen metindeki istenen harf "+ istenenHarf+ harfSayısı+ " kadar kullanılmıştır");




    }


}
