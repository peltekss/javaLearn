package j13_ForEachLoop;

import java.util.Arrays;

public class C03_ForEachLoop {
    public static void main(String[] args) {
        // task -> array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {
                {2, 3},// 0. kat
                {4}, // 1. kat
                {5, 6,7} // 2. kat
        };
        int carpim=1;
        for (int[] avuc1:arr){
            for (int avuc2:avuc1){
                carpim*=avuc2;
            }
        }
        System.out.println("carpim = " + carpim);

        System.out.println("***Dogukan bey For i***");
        System.out.println("Your Array: " + Arrays.deepToString(arr));
        int times = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                times *= arr[i][j];
            }
        }
        System.out.println("multiplication of array elements: " + times);
    }
}
