package j07_StringManipulation;

public class C12_Replace_ReplaceAll {
    public static void main(String[] args) {
        /*replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */
        String str = "Madem geldin dünyaya çalış JAVA'ya";
        System.out.println("str = " + str);
        System.out.println("str.replace(\"a\",\"*\") = " + str.replace("a", "*"));//M*dem geldin düny*y* ç*lış JAVA'y*
        System.out.println(str);//"Madem geldin dünyaya çalış JAVA'ya"
        System.out.println("str.replace(\"yaya\",\"$\") = " + str.replace("yaya", "$"));//Madem geldin dün$ çalış JAVA'ya

        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
        //(Regular Expressions)
        //   \\s bosluk
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        str="javaCAN'lara selam olsun 1234567 $ # @ 5 %   :";
        System.out.println("str = " + str);
        System.out.println("str.replaceAll(\"\\\\s\",\"*\") = " + str.replaceAll("\\s", "*"));//javaCAN'lara*selam*olsun*1234567*$*#*@*5*%***:
        System.out.println("str.replaceAll(\"\\\\S\", \"*\") = " + str.replaceAll("\\S", "*"));//************ ***** ***** ******* * * * * *   *
        System.out.println("str.replaceAll(\"\\\\w\", \"*\") = " + str.replaceAll("\\w", "*"));//*******'**** ***** ***** ******* $ # @ * %   :
        System.out.println("str.replaceAll(\"\\\\W\", \"*\") = " + str.replaceAll("\\W", "*"));//javaCAN*lara*selam*olsun*1234567*******5******
        System.out.println("str.replaceAll(\"\\\\d\", \"*\") = " + str.replaceAll("\\d", "*"));//javaCAN'lara selam olsun ******* $ # @ * %   :
        System.out.println("str.replaceAll(\"\\\\D\", \"\") = " + str.replaceAll("\\D", ""));//12345675
        System.out.println("str.replaceAll(\"[^a -zA-Z]\",\"\") = " + str.replaceAll("[^a -zA-Z]", "")); //harfler hariç diğerlerini sil demek. ^->hariç işareti



    }
}
