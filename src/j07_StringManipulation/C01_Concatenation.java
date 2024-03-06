package j07_StringManipulation;

public class C01_Concatenation {

    /*
    concat() -> methodu içinde parametre aldığı String variable'ı çalıştığı string sonuna ekler(birleştirir)
    Java '+' işleminde en az bir string ifade varsa artimetik toplama değil birleştirme yapılır.
    */
    public static void main(String[] args) {
    String qa = "Halit ";
    String teamLead = "Abdurrahman ";
        System.out.println("Concat öncesi qa = " + qa);
        System.out.println("qa.concat(teamLead) = " + qa.concat(teamLead));
        System.out.println("teamLead.concat(qa) = " + teamLead.concat(qa));
        System.out.println("concat sonrası qa = " + qa);
        qa=teamLead.concat(qa);
        System.out.println("qa = " + qa);

        /*
        hap bilgi-> String meth. variable de kalıcı değil geçici değişiklik yapar.
        String'de kalıcı değişiklik yapabilmek için atama yapmak gerekir.
       */

        /*
        Hap Bilgi-> Concat meth. parametre olarak String harici bir değer alırsa
        o değeri Stringe çevirip concat (Birleştirme) yapar.
        Concat metodunda String type harici bir type girilirse bu data typı Stringe çevirmek gerekir.
        Concat String harici kabul etmez.

         */

        System.out.println("teamLead.concat(23) = " + teamLead.concat(23+"&"));
        System.out.println("teamLead.concat(100+\"\") = " + teamLead.concat(100 + ""));
        System.out.println("teamLead.concat(String.valueOf(true)) = " + teamLead.concat(String.valueOf(true)));
    }
}
