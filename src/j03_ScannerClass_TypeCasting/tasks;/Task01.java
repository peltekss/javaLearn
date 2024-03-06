package j03_ScannerClass_TypeCasting.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)

		  Example:
		      INPUT: mid-term grade=78
		      		 final grade = 66
		      		 project grade = 90
		      OUTPUT: "Your grade is : 81,6"

		 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Mid-term grade: ");
        double midTermGrade = scan.nextInt();
        System.out.println("Final grade: ");
        double finalGrade = scan.nextInt();
        System.out.println("Project grade: ");
        double projectGrade = scan.nextInt();
        double generalGrade = (((midTermGrade * 30) + (finalGrade * 20) + (projectGrade * 50))/100);
        System.out.println("Your grade is : " + generalGrade);
    }
}
