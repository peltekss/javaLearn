package j04_JavaOperators.j02_AssaigmentOperators;

public class C01_AtamaOperatoru {

    //    =         x = 8      x = 8
    //    +=        x += 3     x = x + 3
    //    -=        x -= 3     x = x - 3
    //    *=        x *= 3     x = x * 3
    //    /=        x /= 3     x = x / 3
    //    %=        x %= 3     x = x % 3

    public static void main(String[] args) {

        int saimYas=48;
        System.out.println("saimYas+5 = " + (saimYas + 5));//53 -> atama yapılmadığı için saimYas değişmedi.
        System.out.println("saimYas = " + saimYas);//43
        System.out.println("saimYas += 11 = " + (saimYas += 11));
        System.out.println("saimYas = " + saimYas); // -> Atama yapıldığı için saimYas değişti.
        System.out.println("(saimYas %=5) = " + (saimYas %= 5));
        System.out.println("saimYas = " + saimYas);


    }
}
