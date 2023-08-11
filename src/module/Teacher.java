package module;

public class Teacher extends  User{
    private int teacher;

    public Teacher(String lastName, String firstName, String secondName, int teacher) {
        super(lastName, firstName, secondName);
        this.teacher = teacher;
    }

    public int getTeacherID() {
        return teacher;
    }

    public void setTeacherID(int teacher) {
        this.teacher = teacher;
    }
}
