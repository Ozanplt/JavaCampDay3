public class UserManager {
    public void add(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+"--"+user.getUserName()+" kullanıcı adıyla sisteme kaydedildi");
    }
    public void delete(User user){
        System.out.println(user.getFirstName()+" "+user.getLastName()+"--"+user.getUserName()+" kullanıcı adıyla sistemden silindi");
    }
}
