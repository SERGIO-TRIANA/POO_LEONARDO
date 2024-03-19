package Package_1;

public class GradeBook {

    private String courseName;

    public GradeBook() {
    }

    public GradeBook(String cs102DataStructuresInJava) {
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String displayMessage()
    {
        return  "Welcome to the grade book " + getCourseName();

    }
}
