package Package_1;

import java.io.PrintStream;

public class gradeBookTest {
    public static void main(String[] args) {

        GradeBook gradeBook1 = new GradeBook();
        GradeBook gradeBook2 = new GradeBook();

        gradeBook1.setCourseName("CS101 Introduction to Java Programming");
        gradeBook2.setCourseName("CS102 Data Structures in Java");

        System.out.printf( "gradeBook1 course name is: %s\n",
                gradeBook1.getCourseName() );
        System.out.printf( "gradeBook2 course name is: %s\n",
                gradeBook2.getCourseName() );
    }
}
