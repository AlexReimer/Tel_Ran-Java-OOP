package items;

public class Employee extends Person {
   String company;
   double baseSalary;

    public Employee(String name, int age,  String company, double baseSalary) {
        super (name, age);
        if (company!=null)
            this.company = company;
        else
            System.out.println("Not defined");

        setBaseSalary(baseSalary);
    }

    public Employee (){
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
        if (baseSalary>300&&baseSalary<10_000)
             this.baseSalary = baseSalary;
        else
            System.out.println("Wrong base salary");

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
