package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task34 {

    public static void main(String[] args) {

//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6


        for (int i = 1; i <= 6; i++) {

            for (int j = 1; j < i ; j++) {
                System.out.print(" ");
            }

            for (int j = i ; j<=6; j++) {
                    System.out.print(j+ " ");
            }
            System.out.println();
        }


    }
}


