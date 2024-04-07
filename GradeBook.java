package Package_1;

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
