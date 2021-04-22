package interfaces;

import items.Employee;

import java.util.List;

public interface ICompany {
    boolean hireEmployee(Employee emp);
    Employee fireEmployee(long id);
    boolean setEmployeeSalary(long id, double salary);
    double getCompanyProfit();
    double getCompanyExpenses ();
    int numberOfEmployees();
    Employee findById(long id);
    List<Employee> getEmployeesWithSalary(double start, double finish);
    List<Employee> getFiredEmployees();





}
