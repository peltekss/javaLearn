package j09_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
        /*
        break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
        kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
        herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
        loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
        satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
        içinde kullanıldığı loop'dan çıkışı sağlar:

        temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
        */
        //Task-> girilen bir mail hesabı @ karakterine kadar olan karakterleri print eden code create ediniz...
        // ebikgabık@cimeyıl.com


        Scanner sc = new Scanner(System.in);
        System.out.println("Bir mail hesabı giriniz.");
        String mail = sc.next();
        for (int j = 0; j <mail.length() ; j++) {//email 0. indexten sonuna kadar döngü çalışıyor.
            if (mail.charAt(j) == '@'){// tekrardan girilen her bir index için charın 2Q' eşit olması durumuna bakılıyor.
                break;//if true olduğunda dögü bitiyor veya kırlıyor.
            }
            System.out.println(mail.charAt(j));//if false olduğunda sout çalışıyor.
        }


    }
}