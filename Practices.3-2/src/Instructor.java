public class Instructor  extends User{
    private int instructorId;

    public Instructor() {
    }

    public Instructor(String userName, String firstName, String lastName, int instructorId) {
        super(userName, firstName, lastName);
        this.instructorId = instructorId;
    }

    public int getInstructorId() {
        return instructorId;
    }

    public void setInstructorId(int instructorId) {
        this.instructorId = instructorId;
    }
}
