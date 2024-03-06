package j17_ImmutableClass;

public class C01_ImmutableClass {
    public static void main(String[] args) {
        String str1 = "Sema";//İlk değer initial ataması Sema yapılmış str1 variale String type oluştu.
        String str2 = "Sema";//str1 ve str2 aynı değer ile ilk ataması yapıldığı için StringPool dan aynı referans ile oluştu.
        String str3 = new String("Sema");//İlk değer ataması Sema value ile yapıldı heap memory'da (unique referans değer create edildi.
        String str4 = new String("Sema");//İlk değer ataması Sema value ile yapıldı heap memory'da (unique referans değer create edildi.
        String str5 = str3;
        System.out.println("str1==str2 = " + (str1 == str2));//T-> aynı havuz referans alıyor.
        System.out.println("str3==str5 = " + (str3 == str5));//T-> aynı havuz referans alıyor.
        System.out.println("str2==str3 = " + (str2 == str3));//F->farklı havuz ve obj. ref
        System.out.println("str1.equals(str2) = " + (str1.equals(str2)));//T->aynı value değerler
        System.out.println("str3==str4 = " + (str3 == str4));//F->farklıobj. ref
        System.out.println("str3.equals(str4) = " + (str3.equals(str4)));//T-> aynı variable value
        System.out.println("str1==str5 = " + (str1 == str5));//F-> farklı havuz ref
        System.out.println("str1.equals(str5) = " + str1.equals(str5));//T-> aynı variable value


    }
}
