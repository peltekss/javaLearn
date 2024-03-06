package j08_Loops.Loop02_WhileLoop.Tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz

		 */
		Scanner input = new Scanner(System.in);
        System.out.println("Lütfen isim ve soyisim giriniz");
        String isim = input.nextLine();
        String soyisim = input.nextLine();
		System.out.println(isim.charAt(0) + soyisim.charAt(0));




	}

}
