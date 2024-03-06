package j10_MethodCreation;

public class C01_MethodCreation {
    /*
      code okunabilirliği ve sadeliği için sürekli kullanılan aksiyonlar için method create edip
      main method'a call edip run etmek uygulamanın test edilmesi maintanance ve reusable açısından tercih edilir.
      1) Java method'larin sadece name  değil  name + parametre'lere göre run eder
      parametre sayisi, parametre'lerin data tiplerin ve parametrelerin sırası methodu belirler.

      str.endsWith("el");   Bu method'un gorevi gidip kelimenin son kismini kontrol etmek
                            bu method'u kullanmak icin bu method'un kontrol ettikten sonra
                            bana rapor olarak ne getirdigini bilmem lazim (true/false)

      2) Bir method create edildiğinde  method'un aksiyonuna ve aksiyon çıktısı da method içinde create edilir

      3) Bir method olusturulurken  " str.indexOf(String str, int fromIndex) "
         de oldugu gibi
         disaridan kabul edecegi parametreleri ve bu parametrelerin data tiplerini
         deklare edilmeli

         method call edildiğinde  Parametre olarak
         declare edilen data tiplerine uygun value'ler (ARGUMENT)  girilmeli.
  */
    public static void main(String[] args) {//main level
        selam();topla(); //meth'ler yanyana bu şekilde de yazılabilir.
        //Methodical main içinde call edildiği sıraya göre yukarıdan aşağıya ve soldan sağa run edilir.
        System.out.println(topla1());
        //return type olan meth sout edilmezse veya bir variable a atanıp sout edilmezse
        // konsola çıktı vermez ama metot run edilir.
        topla2(23, 47, 61);
        topla2(21, 12,52 );
        System.out.println("topla3(12,32,41) = " + topla3(12, 32, 41));

    }//main sonu

    private static double topla3(int a, double b, int c) {
        return a + b + c;
    }

    private static void topla2(int hadi, int bakalım, int java) {
        System.out.println("toplam = " + ((hadi+bakalım+java)));
    }


    //method class içine main dışına tanımlanır
    public static void selam() {//psiz return type olmayan -> void method create edildi
        System.out.println("Selamlar");


    }//main sonu

    private static String topla1() {
        int a = 27;
        int b = 55;
        System.out.println("return type meth selamlar");
        return "selam ben topla1 meth'dan javaCAN "+(a+b);
    }


    public static void topla() {//psiz return type olmayan -> void method create edildi
        int a = 53;
        int b = 75;
        int toplam = a + b;
        System.out.println(toplam);
    }



}//Class sonu


