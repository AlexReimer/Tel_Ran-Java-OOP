package start;


import items.Employee;
import items.Manager;
import items.SalesMan;
import items.WageEmployee;

public class EmployeesAppl {
    public static void main(String[] args) {
        Manager m1 = new Manager( "name1", 43,"bas", 3500.00, 2);
        Manager m2 = new Manager( "name2", 37,"abs", 3900.00, 3);
        SalesMan s1 = new SalesMan("name3", 35, "bcd", 2000.00, 35_000.43, 2);
        SalesMan s2 = new SalesMan("name4", 28, "qcd", 2000.00, 12_000.64, 2);
        WageEmployee w1 = new WageEmployee( "name5", 34,"tttr", 2100.00, 120, 15.50);
        WageEmployee w2 = new WageEmployee( "name6", 43,"trtr", 2100.00, 120, 15.50);

        Employee[] emps = new Employee[]{m1, m2, s1, s2, w1, w2};

        printAllEmployees(emps);

    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee e : emps) {
            System.out.println(e);
        }
    }
}
