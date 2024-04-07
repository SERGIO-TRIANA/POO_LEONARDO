package Package_1;

import java.util.Scanner;

public class averageClassGradeBook {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming");
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();

    }
}
