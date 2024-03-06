package j07_StringManipulation.tasks;

        import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir isim giriniz");
        String name = scanner.nextLine();
        String sonuç = (name.length()==3)? (name.charAt(0) != name.charAt(1)) ? (name.charAt(1) != name.charAt(2)) ?
                (name.charAt(0) != name.charAt(2)? "Üç harfli ve Farklı" : "Üç harfli ve Aynı"):
                "Üç harfli ve ikinci ile üçüncü harf aynı" : "Üç harfli ve ilk ile ikinci harf aynı": "Üç harfli değil";
        System.out.println(sonuç);
    }
}