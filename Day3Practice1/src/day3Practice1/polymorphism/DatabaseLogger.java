package day3Practice1.polymorphism;

public class DatabaseLogger extends BaseLogger {
	@Override
	public void log(String message) {
		System.out.println("Database Logger: " + message);
	}
}
