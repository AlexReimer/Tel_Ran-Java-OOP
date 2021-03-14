package appl;
import data.Employee;
import data.Manager;
import data.SalesMan;
import data.WageEmployee;

public class EmployeesAppl {

	public static void main(String[] args) {
		
		Employee[] emps = { new Manager("Vasya", 1111111, 22, "Company", 15000, 2),
				new Manager("Masha", 2222222, 34, "Company", 16000, 3),
				new SalesMan("Petya", 3333333, 54, "Company1", 5900, 100800, 10),
				new SalesMan("Masha", 4444444, 32, "Company2", 6000, 140000, 10),
				new WageEmployee("Dasha", 5555555, 44, "Company", 7000, 170, 30),
				new WageEmployee("Kira", 6666666, 29, "Company", 6000, 180, 35) };
	
		printAllEmployees(emps);
		
	}

	private static void printAllEmployees(Employee[] emps) {
		for(Employee e : emps) {
			System.out.println(e.toString());
		}
		
	}

	

}