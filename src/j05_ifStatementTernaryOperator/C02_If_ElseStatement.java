package j05_ifStatementTernaryOperator;

import java.util.Scanner;

public class C02_If_ElseStatement {
    public static void main(String[] args) {
        // task-> girilen yasın 18 den buyulugunu kontrol eden code create ediniz..
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yasınızı giriniz: ");
        int yas = scanner.nextInt();
        if (yas >= 18) {
            System.out.println("Yasınız 18 yaşından büyüktür");
        } else {
            System.out.println("Yasınız 18 yaşından küçüktür");
        }

    }
}
