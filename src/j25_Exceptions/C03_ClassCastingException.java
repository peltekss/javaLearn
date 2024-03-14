package j25_Exceptions;

public class C03_ClassCastingException {
    public static void main(String[] args) throws ClassCastException {//unchecked exc. throws exc. handle edemez RTE exc. try catch kullanılır.
        //ClassCastingException-> Biribirine donusturulemeyen data type'lar donusturme isleminde olusan RTE
        Object obj = "Javacan'lara selam";
        System.out.println("obj = "+obj);
        String str= (String) obj;
        System.out.println("str = "+str);
        Object sayi = 49;
//        String sayiStr= (String) sayi;
//        System.out.println("sayiStr = " + sayiStr);

        try {
            String sayiStr= (String) sayi;
            System.out.println("Try bloktan selamlar. Bu mesajı okuyorsan try sorunsuz çalıştı. Catch blok çalışmadı ");
        }catch(ClassCastException e){
            System.out.println("int data type  String'e dönüştürülemez");
            System.out.println("Bu mesajı okuyorsan try exc yakaladı.");
        }
        System.out.println("****");
        try {
            String str1= (String) obj;
            System.out.println(str1);
            System.out.println("Try bloktan selamlar. Bu mesajı okuyorsan try sorunsuz çalıştı. Catch blok çalışmadı ");
        }catch(ClassCastException e){
            System.out.println("int data type  String'e dönüştürülemez");
            System.out.println("Bu mesajı okuyorsan try exc yakaladı.");
        }
        System.out.println("Eğer bu mesajı okuyorsan app sorunsuz çalıştı");


    }
}
