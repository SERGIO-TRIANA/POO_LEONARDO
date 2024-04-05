package Package_1;

import java.util.Scanner;

public class promedioClaseGradeBook {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int total = 0;
        int gradeCounter = 1;

        while (gradeCounter <= 10){
            System.out.println("Enter grade: ");
            int grade = keyboard.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter +1;
        }
        int average = total / 10;
        System.out.println( "Total of all 10 grades is: " + total);
        System.out.println("class average is " + average);
    }
}
