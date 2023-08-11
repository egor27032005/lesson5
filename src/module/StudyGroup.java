package module;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup {
    private int Teacher;
    private List<Student> student =new ArrayList<Student>();

    public StudyGroup(int teacher, List<Student> student) {
        Teacher = teacher;
        this.student = student;
    }

    public int getTeacher() {
        return Teacher;
    }

    public void setTeacher(int teacher) {
        Teacher = teacher;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "Teacher=" + Teacher +
                ", student=" + student +
                '}';
    }
}
