package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
        //Task-> Girilen  VIP (Very Important Person) kisaltmasindaki harflerin anlamini print eden code create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen harf giriniz");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch){
            case 'v': System.out.println("Very");break;
            case 'i': System.out.println("Important");break;
            case 'p': System.out.println("Person");break;
            default: System.out.println("Lütfen geçerli bir HARF giriniz");
        }


    }
}
