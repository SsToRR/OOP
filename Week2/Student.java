package Week2;

public class Student {

    private String studentName;
    private final int studentID;
    private int yearOfStudy;
    private double studentGPA;

    public Student(String name, int id, int yos, double gpa) {
        this.studentName = name;
        this.studentID = id;
        this.yearOfStudy = yos;
        this.studentGPA = gpa;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentID() {
        return studentID;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public double getStudentGPA() {
        return studentGPA;
    }

    public String toString() {
        return studentName + " (ID: " + studentID + ", GPA: " + studentGPA + ")";
    }
}
