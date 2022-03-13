package day3Practice1.polymorphism;

public class EmailLogger extends BaseLogger{
    public void log(String message){
        System.out.println("Email Logger: " + message);
    }
}
