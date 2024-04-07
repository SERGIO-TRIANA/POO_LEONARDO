package Package_1;

import java.util.Scanner;

public class GradeBook {

    private String courseName;

    public GradeBook(String name) {
        courseName = name;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for: " + getCourseName());
    }
    public void determineClassAverage()
    {
        Scanner input = new Scanner(System.in);

        int total;
        int gradeCounter;
        int grade;
        int average;

        total = 0;
        gradeCounter = 1;

        while (gradeCounter <= 10)
        {
            System.out.print("Enter grade: ");
            grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        average = total / 10;
        System.out.println("\n Total of all 10 grades is: " + total);
        System.out.println("Class average is: " + average);
    }
}
/*
    public GradeBook() {
    }

    public static long promEstudiante(long a, long b, long c, long d, long e) {
        long prom = (a + b + c + d + e) / 5;

        return prom;
    }

    ;


    public GradeBook(String cs102DataStructuresInJava) {
    }
}


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }


}

 */
