public class EmployeesAppl {
    public static void main(String[] args) {
        Manager m1 = new Manager("name1", 43, 1111111, "bas", 3500.00, 2);
        Manager m2 = new Manager("name2", 37, 1111112, "abs", 3600.00, 3);
        Manager m3 = new Manager("name3", 52, 1111113, "abs", 3800.00, 4);

        SalesMan s1 = new SalesMan("name4", 35, 1111114, "bcd", 2000.00, 35_000.43, 2);
        SalesMan s2 = new SalesMan("name5", 28, 1111115, "qcd", 2000.00, 12_000.64, 2);
        SalesMan s3 = new SalesMan("name6", 25, 1111116, "qcd", 2000.00, 12_000.64, 2);

        WageEmployee w1 = new WageEmployee("name7", 34, 1111117, "tttr", 500.00, 120, 15.50);
        WageEmployee w2 = new WageEmployee("name8", 43, 1111118, "trtr", 600.00, 150, 15.50);
        WageEmployee w3 = new WageEmployee("name9", 55, 1111118, "trbg", 800.00, 145, 15.50);

        Employee[] emps = new Employee[]{m1, m2, m3, s1, s2, s3, w1, w2, w3};

        printAllEmployees(emps);

        getSumSalaryAllEmployees(emps);

        printEmpsWithSalaryMoreThan(emps, 3000.00);

        getCompanyRevenue(emps);

    }

    private static double getCompanyRevenue(Employee[] emps) {
        double res = 0;
        for (int i = 0; i < emps.length; i++) {
            if (emps[i] instanceof SalesMan) {
                //если i порожден SalesMan, то кастуй его вниз ((SalesMan) emps[i])
                res += ((SalesMan) emps[i]).totalSales;
            }
            System.out.println("Total sales: " + res);
        }
        return res;
    }

    private static void printEmpsWithSalaryMoreThan(Employee[] emps, double salary) {
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].calcSalary() >= salary) {
                System.out.println("Employee " + emps[i].getName() + ", " + " id: " + emps[i].getId()
                        + "," + "earns more than " + salary);
            }
        }
    }

    private static double getSumSalaryAllEmployees(Employee[] emps) {
        double sum = 0;
        for (int i = 0; i < emps.length; i++) {
            sum += emps[i].calcSalary();
            System.out.println("Total salary amount of all employees:  " + sum);
        }
        return sum;
    }


    private static void printAllEmployees(Employee[] emps) {
        for (Employee e : emps) {
            System.out.println(e);
        }
    }
}
