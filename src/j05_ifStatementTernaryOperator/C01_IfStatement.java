package j05_ifStatementTernaryOperator;

public class C01_IfStatement {
    /*
    if statement blok herhangi bir actionun belirli bir şarta bağlı çalışmasını sağlamak için kullanılır.
    */

    public static void main(String[] args) {
        int semraYas = 16;
        int merveYas = 28;

        if (semraYas == merveYas) {
            System.out.println("yasdas arkadaslar");
            System.out.println("yoksa szi ikiz misiniz?");
        }
        if (merveYas >= 40) System.out.println("Merve Hanımın yası 40'tan buyuk.");
        // If bloktan sonra tek satırlık işlem varsa {} gerek yok
        if (merveYas+semraYas>=45) {
            System.out.println("Tek satırlık aksiyonlarda {} kullanılmaz");
            System.out.println("Javacanlara selam olsun.");
        }


        System.out.println("Bu çıktıyı okuyorsan kod çalışıyordur");
    }
}
