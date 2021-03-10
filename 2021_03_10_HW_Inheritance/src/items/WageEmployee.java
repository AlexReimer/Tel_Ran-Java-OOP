package items;

public class WageEmployee extends Employee {
    int hours;
    double wage;

    public WageEmployee(String name, int age, String company, double baseSalary, int hours, double wage) {
        super(name, age, company, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", company: " + company + '\'' +
                ", baseSalary= " + baseSalary +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }
}
