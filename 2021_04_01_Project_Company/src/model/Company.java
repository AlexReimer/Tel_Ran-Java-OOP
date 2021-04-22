package model;

import interfaces.ICompany;
import items.Employee;
import items.Manager;
import items.SalesMan;
import items.WageEmployee;

import java.util.List;
import java.util.TreeSet;

public class Company implements ICompany {
    private String name;
    private String address;
    private TreeSet<Employee> emps = new TreeSet<>();
    private TreeSet<Employee> firedEmps = new TreeSet<>();
    // Set-Collection: а)размер динамический б) set -> точно не будет повторов
    // плюс будет отсортирована по методу compareTo прописанном в классе Person (сорт. по id)

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        int count = 1;
        String str = "Company name: " + name + "\nCompany address: " + address + "\n";
        for (Employee e : emps) {
            str += "=========================" + count + "=========================\n";
            str += "Company: " + e.getCompany() + "\n";
            str += "Employee id: " + e.getId() + "\n";
            str += "Name : " + e.getName() + "\n";
            str += "Salary : " + e.calcSalary() + "\n";
            count++;
        }
        return str;
    }


    @Override
    public boolean hireEmployee(Employee emp) {
        //прием на работу
        //проверка на null + не работал ли чел. уже в компании (смотрим в списке уволенных firedEmps.contains(emps)
        if (emp == null || firedEmps.contains(emp))
            return false;
        //не нужна проверка есть ли уже такой сотрудник, т.к. TreeSet не добавит дубль,
        // то есть если вернет true (а метод add в коллеккицях это boolean), значит такого нет и новый добавлен
        //если бы использовал здесь не Set, а List (arraylist or LinkedList), где дубли возвожны, то нужны были проверки
        return emps.add(emp);
    }

    @Override
    public Employee fireEmployee(long id) {
        //увольнение: 1) находим по ID используя уже существующий метод findById
        // 2) revome из списка сотрудников 3) add в список уволенных
        Employee temp = findById(id);
        //проверка на null, который вернется если человек по ID не найден в базе
        if (temp != null) {
            emps.remove(temp);
            firedEmps.add(temp);
        }
        return temp;
    }

    @Override
    public boolean setEmployeeSalary(long id, double salary) {
        if (salary < Manager.calcSalary() || salary < WageEmployee.calcSalary() || salary < SalesMan.calcSalary())
            System.out.print("You can't change a salary because it is smaller then current salary.");
        //Employee persToChangeSalary = findById(id);
        for (Employee j : emps) {
            if (j.getId() == id){
              //  persToChangeSalary = j;
               j.calcSalary()=salary;
               return true;
            }
        }
        return false;
    }

    @Override
    public double getCompanyProfit() {
        double profit = 0.;
        for (Employee j : emps) {
            if (j instanceof SalesMan) {
                profit += ((SalesMan) j).getTotalSales();
            }
        }
        return profit;
    }

    @Override
    public double getCompanyExpenses() {
        double expensesCompn = 0;
        double expensMgs = 0;
        double expensW_Emp = 0;
        double expensS_Mn = 0;
        for (Employee j : emps) {
            if (j instanceof Manager) expensMgs += (j.getBaseSalary() * ((Manager) j).getGrade());
            if (j instanceof WageEmployee) expensW_Emp += (((WageEmployee) j).getWage() * ((WageEmployee) j).getHours());
           if (j instanceof SalesMan) expensS_Mn += (j.getBaseSalary() + (((SalesMan) j).getBonus() * ((SalesMan) j).setTotalSales())/100);
            expensesCompn = expensMgs + expensW_Emp + expensS_Mn;
        }
        return expensesCompn;
    }

    @Override
    public int numberOfEmployees() {
        int count = 0;
        for (int i = 1; i< emps.size(); i++)
            count++;
        return count;
    }

    @Override
    public Employee findById(long id) {
        //перебираем поэлементно (e) коллекцию emps
        for (Employee e : emps) {
            if (e.getId() == id) { //сравнивай ID из базы с тем, которого мы ищем
                //если нашел, верни его - e
                return e;
            }
        }
        //есл не нашел, верни null
        return null;
    }

    @Override
    public List<Employee> getEmployeesWithSalary(double start, double finish) {
        return null;
    }

    @Override
    public List<Employee> getFiredEmployees() {
        return null;
    }
}
