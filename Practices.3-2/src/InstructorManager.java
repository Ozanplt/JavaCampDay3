public class InstructorManager extends UserManager{

    public void login(Instructor instructor){
        System.out.println(instructor.getFirstName()+" "+instructor.getLastName()+"--"+instructor.getUserName()+" kullanıcı adıyla eğitmen sistemine giriş yaptı");
    }

}
