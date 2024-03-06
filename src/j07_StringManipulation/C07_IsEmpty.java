package j07_StringManipulation;

public class C07_IsEmpty {
    public static void main(String[] args) {
        /*
        isEmpty()
        Metnin boş olup olmadigini kontrol eder. Sonucu boolean dir.

       String IsEmpty
    String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
    isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
    Yani o String'in length() 0 demektir.
    length()==0 demek isEmpty() true verir demektir.
        */

        String str = "Madem geldin dünyaya çalış Javaya.";
        System.out.println("str.length() = " + str.length());
        System.out.println("str.isEmpty() = " + str.isEmpty());

        String str1="";
        System.out.println("str1.length() = " + str1.length());
        System.out.println("str1.isEmpty() = " + str1.isEmpty());

        String str2=" ";
        System.out.println("str2.length() = " + str2.length());
        System.out.println("str2.isEmpty() = " + str2.isEmpty());

        //String str3=null;
        //System.out.println("str3.length() = " + str3.length());
        //System.out.println("str3.isEmpty() = " + str3.isEmpty());

        //isBlank() -> hem boş yani hiçlik tanımlanan  String için hem de space içeren String içeren String için True döner değilse False.
        System.out.println("str2.isBlank() = " + str2.isBlank());
        System.out.println("str1.isBlank() = " + str1.isBlank());

        String str4="       x      ";
        System.out.println("str4.isBlank() = " + str4.isBlank());

        String str5;
        //System.out.println(str5);
        //System.out.println("str5.isEmpty() = " + str5.isEmpty());undefined degisken hicbir aksiyona tabi tutulamaz


    }
}
