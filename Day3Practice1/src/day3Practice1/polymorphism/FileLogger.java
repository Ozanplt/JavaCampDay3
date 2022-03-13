package day3Practice1.polymorphism;

public class FileLogger extends BaseLogger{
    public void log(String message){
        System.out.println("File Logger: " + message);
    }
}
