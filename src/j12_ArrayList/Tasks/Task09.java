package j12_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
  /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
        int toplam = 0;
        for (int i = 0; i < list.size(); i++) {
            toplam += list.get(i) * list.get(i);
        }
        System.out.println("toplam = " + toplam);


    }
}
