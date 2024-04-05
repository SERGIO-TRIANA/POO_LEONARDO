package Package_1;

import java.io.PrintStream;
import java.util.Scanner;

public class gradeBookTest {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        long a, b, c, d, e, prom = 0;

        System.out.println("digite la nota de la a ");
        a = keyboard.nextLong();
        System.out.println("digite la nota de la b ");
        b = keyboard.nextLong();
        System.out.println("digite la nota de la c ");
        c = keyboard.nextLong();
        System.out.println("digite la nota de la d ");
        d = keyboard.nextLong();
        System.out.println("digite la nota de la e ");
        e = keyboard.nextLong();
            prom = GradeBook.promEstudiante(a,b,c,d,e);
            System.out.println("el promedio es " + prom);


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
