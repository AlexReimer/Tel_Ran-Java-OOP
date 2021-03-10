package items;

public class Employee extends Person {
   String company;
   double baseSalary;

    public Employee(String company, double baseSalary) {
        this.company = company;
        this.baseSalary = baseSalary;
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
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "items.Employee{" +
                "company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
