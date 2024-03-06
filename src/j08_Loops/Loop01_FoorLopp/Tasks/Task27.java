package j08_Loops.Loop01_FoorLopp.Tasks;

import java.sql.SQLOutput;

public class Task27 {
    public static void main(String[] args) {
            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */

        for (int IT = 1; IT <=3 ; IT++) {
            System.out.println("IT: "+ IT);
            for (int QA = 1; QA <=3 ; QA++) {
                System.out.println(" QA: "+ QA);
            }
            System.out.println(" ....");

        }



    }
}
