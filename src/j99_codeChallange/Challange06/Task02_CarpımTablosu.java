package j99_codeChallange.Challange06;

public class Task02_CarpımTablosu {
    // 1 x 1 = 1
    // 1 x 2 = 2
    // 1 x 3 = 3
    // 1 x 4 = 4
    // 1 x 5 = 5
    // 1 x 6 = 6
    // 1 x 7 = 7
    // 1 x 8 = 8
    // 1 x 9 = 9
    // 1 x 10 = 10
    // Task-> Yukarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {//outer loop -> dış döngü -> kat tekrarı
            for (int j = 1; j <= i; j++) {//inner loop -> iç döngü -> daire tekrarı
                System.out.println(i + " x " + j + " = " + (i * j));

            }
            System.out.println();

        }


    }
}


