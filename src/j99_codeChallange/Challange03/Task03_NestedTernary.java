package j99_codeChallange.Challange03;

import java.util.Scanner;

public class Task03_NestedTernary {

    /*  Task
     Girilen Final için
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri..
    print eden code create ediniz.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir not giriniz.");
        char finalNot = input.next().toUpperCase().charAt(0);

        System.out.println(finalNot == 'A' ? "Gayet Başarılı"
                : finalNot == 'B' ? "Başarılı" : finalNot == 'C' ? "Ha Gayret" : "Seneye cınım");

    }

}
