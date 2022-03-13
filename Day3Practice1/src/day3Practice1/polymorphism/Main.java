package day3Practice1.polymorphism;



public class Main {

	public static void main(String[] args) {
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.log("File Logger ile loglandı");
		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new EmailLogger(), new DatabaseLogger() };//Polymorphism
		for (BaseLogger logger : loggers) {
			logger.log("Log Mesajı");
		}
		System.out.println("-------------------------------");
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());// Polymorphism
		customerManager.add();

	}

}
