package appl;

import items.*;
import model.Company;

public class CompanyAppl {
    public static void main(String[] args) {
        Employee m1 = new Manager("Ivanov", 100_023_091, 23, "H&M", 1500, 3);
        Employee m2 = new Manager("Petrov", 101_023_092, 28, "H&M", 1700, 2);
        Employee m3 = new Manager("Kuzin", 102_023_093, 30, "H&M", 1900, 1);

        Employee sm1 = new SalesMan("Sidorov", 103_023_094, 33, "H&M", 1500, 324300.9, 12);
        Employee sm2 = new SalesMan("Durov", 191_023_095, 34, "H&M", 2000, 102999.99, 20);
        Employee sm3 = new SalesMan("Gurov", 199_023_096, 44, "H&M", 2000, 1233999.99, 30);

        Employee we1 = new WageEmployee("Rogov", 120_023_097, 34, "H&M", 0, 23, 13.54);
        Employee we2 = new WageEmployee("Pirogov", 122_023_098, 36, "H&M", 0, 34, 14.9);
        Employee we3 = new WageEmployee("Permyakov", 123_023_099, 38, "H&M", 0, 39, 14.9);

        Employee[] emps = new Employee[]{m1, m2, m3, sm1, sm2, sm3, we1, we2, we3};

        Company company = new Company("Roga_i_kopyta", "Kazakhstan, Almaty, Nazarbaev str.1");
        System.out.println(company);

        //заполняем компанию сотрудниками
        for (Employee emp : emps) {
            company.hireEmployee(emp);
        }
        System.out.println(company);


        company.getCompanyExpenses(---);
        System.out.println(company);
    }


}
