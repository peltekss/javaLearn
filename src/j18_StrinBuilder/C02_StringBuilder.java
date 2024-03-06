package j18_StrinBuilder;

public class C02_StringBuilder {
    public static void main(String[] args) {
        //StringBuilder create etme -> Decleration

        //1.yol
        StringBuilder sb1=new StringBuilder();
        System.out.println("sb1 = " + sb1);//hiclik
        System.out.println("sb1.length() = " + sb1.length());//0
        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        sb1.append("Tuba hanim ");//sb1'e value eklendi
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());//11
        System.out.println("sb1.capacity() = " + sb1.capacity());//16
        sb1.append("bilgisayari costu");
        System.out.println("sb1 = " + sb1);
        System.out.println("sb1.length() = " + sb1.length());//28
        System.out.println("sb1.capacity() = " + sb1.capacity());//16*2+2=34
        //capasity asiminda yenicapasity=eskicapasity*2+2 seklinde hesaplanir
        sb1.append(" insallah kendine gelir");
        System.out.println("sb1.capacity() = " + sb1.capacity());//34*2+2=70

        //2.yol
        StringBuilder sb2=new StringBuilder("Konya'da bamya yemegi");//initialize(ilk deger) atanmis sb olustu
        System.out.println("sb2 = " + sb2);
        System.out.println("sb2.length() = " + sb2.length());//21
        System.out.println("sb2.capacity() = " + sb2.capacity());//16+sb2.length()=37
        //initialize edilmis sb capasity=16+ilkdeger.length()
        //trimtosize()->capasity'deki length fazlasi degerleri siler
        sb2.trimToSize();
        System.out.println("sb2.length() = " + sb2.length());
        System.out.println("trimtosize sonrasi capasity = " + sb2.capacity());

        //3.yol
        StringBuilder sb3=new StringBuilder(17);//17 capasity bir bos sb tanimladi
        System.out.println("sb3 = " + sb3);//hiclik
        System.out.println("sb3.length() = " + sb3.length());//0
        System.out.println("sb3.capacity() = " + sb3.capacity());//17
        sb3.append("155'i ararun cincix code");
        System.out.println("sb3 = " + sb3);
        System.out.println("sb3.length() = " + sb3.length());//24
        System.out.println("sb3.capacity() = " + sb3.capacity());//17*2+2=36

        //sb'de istenen index karakteri alma
        System.out.println("sb3.charAt(17) = " + sb3.charAt(17));//i
        //System.out.println("sb3.charAt(99) = " + sb3.charAt(99));//RTE->StringIndexOutOfBoundsException

        //sb'deki belli araliktaki karakterleri alma
        System.out.println("sb3.substring(11) = " + sb3.substring(11));//n cincix code
        System.out.println("sb3.subSequence(12,21) = " + sb3.subSequence(12, 21));// cincix c
        System.out.println("sb3.substring(12,21) = " + sb3.substring(12, 21));// cincix c

        //Sb'deki istenen index char'i silme
        System.out.println("sb3.deleteCharAt(23) = " + sb3.deleteCharAt(23));//155'i ararun cincix cod
        System.out.println("sb3 = " + sb3);//155'i ararun cincix cod

        //Sb'de istenen aralikta index karakterleri silme
        System.out.println("sb3.delete(12,21) = " + sb3.delete(12, 21));//155'i ararunod

        //sb'e char ve charlari girdi yapma insert
        System.out.println("sb3.insert(3,sb2,7,11) = " + sb3.insert(3, sb2, 7, 11));//155a ba'i ararunod

        //sb'deki istenen index char'i update(set) etme
        sb3.setCharAt(2,'$');
        System.out.println("sb3 = " + sb3);//15$a ba'i ararunod

        //sb'deki istenen index birden fazla char set etme
        System.out.println("sb3.replace(1,7,\"*\") = " + sb3.replace(1, 7, "******"));//1******'i ararunod

        //sb obj string variableye cevirme
        StringBuilder sb4=new StringBuilder("Savfet bey gecmis olsun");
        System.out.println("sb4 = " + sb4);//Savfet bey gecmis olsun
        System.out.println("sb4.toString().toUpperCase() = " + sb4.toString().toUpperCase());//SAVFET BEY GECMİS OLSUN

        //str variableyi sb variableye cevirme
        String str="Hayirli geceler";
        System.out.println("str = " + str);//Hayirli geceler
        StringBuilder sb5=new StringBuilder(str);//String variable sb'ye atandi
        System.out.println("sb5 = " + sb5);//Hayirli geceler

        /*
        compareTo()->metodunu iki SB'i eşitliğini kontrol etmek için ilk characterden itibaren tum characterleri karşılaştırır.
        eşit characterler için herhangi bir return vermezken farklı characterler için ascii table göre kaç değer geri veya ileri oldg
        print eder
        Tum characterler eşit ise 0 return eder
        ahan da Trick-> SB ile String variable compare edilirse :CTE -> elma armut kıyası olmaz...
         */
        StringBuilder sb6= new StringBuilder("Bahanesi olanın başarısı olamaz.");
        StringBuilder sb7= new StringBuilder("Bahanesi olanın başarısı olamaz.");
        StringBuilder sb8= new StringBuilder("Bahanesi olanın Başarısı olamaz.");
        String str1 = "Bahanesi olanın başarıısı olamaz";
        System.out.println("sb6.compareTo(sb7) = " + sb6.compareTo(sb7));
        System.out.println("sb6.compareTo(sb8) = " + sb6.compareTo(sb8));
        //System.out.println("sb6.compareTo(str) = " + sb6.compareTo(str));
        System.out.println("sb6.compareTo(new StringBuilder(str1)) = " + sb6.compareTo(new StringBuilder(str1)));

        //sb eşitliği
        System.out.println("sb6.equals(sb7) = " + sb6.equals(sb7));
        System.out.println("sb6==sb7 = " + (sb6 == sb7));
        System.out.println("sb6.equals(str1) = " + (sb6.equals(str1)));
        //System.out.println("sb6==str1 = " + (sb6 == str1));CTE

        //Trick-> SB'de equals() meth ayni == gibi hem de value karşılaştırması yapar. True veya false return eder.

        //SB'de karakterleri indexe göre ters çevirme yani tersten yazma
        System.out.println("reverse öncesi sb6 = " + sb6);
        System.out.println("reverse sonrası sb6.reverse() = " + sb6.reverse());


    }
}
