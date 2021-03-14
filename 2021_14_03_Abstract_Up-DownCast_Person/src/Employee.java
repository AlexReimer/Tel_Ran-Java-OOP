import java.util.Objects;

public abstract class Employee extends Person {
    String company;
    double baseSalary;

    public Employee(String name, int age, long id, String company, double baseSalary) {
        super(name, age, id);
        if (company != null)
            this.company = company;
        else
            System.out.println("Not defined");

        setBaseSalary(baseSalary);
    }

    public Employee() {

        this.company = "Not defined";
    }


    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0)
            this.baseSalary = baseSalary;
        else
            System.out.println("Wrong base salary");

    }

    @Override
    public String toString() {
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                "company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.baseSalary, baseSalary) == 0 && company.equals(employee.company);
    }

    public abstract double calcSalary();

}
