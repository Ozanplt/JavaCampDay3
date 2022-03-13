public class Main {
    public static void main(String[] args) {
        Instructor instructor1 = new Instructor("Engin_Demiroğ","Engin","Demiroğ",123456);
        Student student2 = new Student("YYY","qweqasd","asdasdqw",78901);
        Student student1 = new Student("ZZZ","Ozan","Polat",172391);

        InstructorManager instructorManager = new InstructorManager();

        StudentManager studentManager = new StudentManager();
        //operations
        studentManager.add(student1);
        instructorManager.login(instructor1);
        studentManager.delete(student2);

    }
}
