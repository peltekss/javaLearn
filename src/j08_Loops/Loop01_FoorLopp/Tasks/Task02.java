package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length() / 2; i++) {
            if (input.charAt(i) == input.charAt(input.length() - 1 - i)) {
                count++;
            }
        }
        if (count == input.length() / 2) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

    }
}
