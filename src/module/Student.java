package module;

public class Student extends User{
    public Student(String lastName, String firstName, String secondName, int studentID) {
        super(lastName, firstName, secondName);
        this.studentID = studentID;
    }

    private int studentID;

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                '}';
    }
}
