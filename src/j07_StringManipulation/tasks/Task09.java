package j07_StringManipulation.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista

		 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir metin giriniz");

        String city = scanner.nextLine();
        System.out.println(city.substring(0, city.length()/2));



    }
}
