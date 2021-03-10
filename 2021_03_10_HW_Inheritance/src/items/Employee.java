package items;

public class Employee extends Person {
   String company;
   double baseSalary;

    public Employee(String name, int age,  String company, double baseSalary) {
        super (name, age);
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
        return "Employee{" +
                " name='" + name + '\'' +
                ", age=" + age +
                "company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
