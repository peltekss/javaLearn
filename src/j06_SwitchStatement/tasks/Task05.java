package j06_SwitchStatement.tasks;

import java.util.Scanner;

public class Task05 {

    public static void main(String[] args) {
		/*
		TASK :
		Girilen note değerinin  aşağıdaki kurallara göre karşılığını print eden code create ediniz.
		1. 0(dahil) ile 50 arasi - D
		2. 50(dahil) ile 60 arası - C
		3. 60(dahil) ile 80 arası - B
		4. 80(dahil) ustu- A
		Yanlis not girilirse ekrana "Lütfen gecerli not giriniz" print ediniz
		
		AHAN DA  TRICK :) switch() de long kullanilmaz, float kullanilmaz, double kullanilmaz, boolean kullanilmaz.
		switch() de int, byte, short, char, String kullanilir.

		 */

        Scanner scanner = new Scanner(System.in);
        int not = scanner.nextInt();

        String sonuç = " ";
        if (not >= 0 && not < 50) {
            sonuç = "başarısız";
        } else if (not < 60) {
            sonuç = "iyi";
        } else if (not < 80) {
            sonuç = "çok  iyi";
        } else {
            sonuç = "süper";
        }

        switch (sonuç){
            case "başarısız": System.out.println("D");break;
            case "iyi": System.out.println("C");break;
            case "çok  iyi": System.out.println("B");break;
            case "süper": System.out.println("A");break;
            default: System.out.println("Lütfen gecerli not giriniz");
        }

    }
}





