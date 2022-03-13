public class StudentManager extends UserManager{
    public void login(Student student){
        System.out.println(student.getFirstName()+" "+student.getLastName()+"--"+student.getUserName()+" kullanıcı adıyla öğrenci sistemine giriş yaptı");
    }
}
