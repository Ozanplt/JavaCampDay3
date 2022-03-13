package day3Practice1.inheritance;

public class Main {

	public static void main(String[] args) {
        Customer customer = new Customer();
        Employee employee = new Employee();
        customer.name="Ozan";
        employee.id=1;
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.list();
        employeeManager.add();
        employeeManager.bestEmployee();

	}

}
