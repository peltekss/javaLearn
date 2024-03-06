package j07_StringManipulation;

public class C13_ValueOf_Parse {
    public static void main(String[] args) {
        /*
        Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
        Stringlerle matematiksel islemler yapabilmemizi saglar.

        valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
        valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
        */

        // task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz.

        String b1="10000";
        String b2="12000";
        System.out.println((b1 + b2));//String olduğu için concat işlemi yapar. Stringlerde kesinlikle toplama işemi yapmaz.
        int yenib1=Integer.valueOf(b1);
        int yenib2=Integer.valueOf(b2);
        System.out.println("\"Bağış toplama =\"+ (yenib1+yenib2) = " + "Bağış toplama =" + (yenib1 + yenib2));

        int tc=98765432;
        String yeniTc=String.valueOf(tc);

        System.out.println(yeniTc);
        System.out.println("tc = " + tc);
        System.out.println((tc + yeniTc));

        /*
        Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
        output: strA+strB=31.54
        */

        String strA= "$13.99";
        String strB= "$17.55";
        //int yeniA=Integer.valueOf(strA);//RTE
        double yeniA=Double.parseDouble(strA.replace("$",""));
        double yeniB=Double.parseDouble(strB.replace("$",""));
        System.out.println("yeniB+yeniA = " + (yeniB+yeniA));




    }
}
