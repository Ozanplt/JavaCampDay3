public class Student extends User{
    private int studentId;

    public Student() {

    }

    public Student(String userName, String firstName, String lastName, int studentId) {
        super(userName, firstName, lastName);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}
