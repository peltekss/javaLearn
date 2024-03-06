package j04_JavaOperators.j01_AritmeticOperators;

public class C02_IncrementDecrement {

    /*
    Increment-> bir variable'in degerini toplama veya carpma işlemleri ile artırılmasıdır.
    Decrement-> bir variable'in degerini cikarma veya bolme işlemleri ile azaltılmasıdır.
    */

    public static void main(String[] args) {
        System.out.println("***Increment - Arttırma***");
        int a=3;
        System.out.println(a);
        System.out.println(++a);//4 Önce arrtır sonra sout yap yani yazdır.
        System.out.println(a++);//4 önce sout yap sonra a nın değerini arttır.
        System.out.println(a);//5

        a=8;
        System.out.println(a);
        System.out.println(a++ + ++a);
        //System.out.println(a++ + a++);
        System.out.println(++a + a++ + a++);
        System.out.println(a);

        System.out.println("***Decrement - Azaltma");
        int b=3;
        System.out.println(b);//3
        System.out.println(b--);//3
        System.out.println(--b);//1

        int x=20;
        int y=15;

        System.out.println("****");
        System.out.println(++x + y--);
        System.out.println(y++ + x++ + --x);//56

        int k=5;
        int sonuç=++k + k++ + --k + k-- + k;
        System.out.println(sonuç);



    }
}
