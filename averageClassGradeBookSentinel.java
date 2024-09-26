package Package_1;

public class averageClassGradeBookSentinel {
    public static void main(String[] args) {

        GradeBook myGradeBook = new GradeBook(
                "CS101 Introduction to Java Programming"
        );
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage2();
    }
}
