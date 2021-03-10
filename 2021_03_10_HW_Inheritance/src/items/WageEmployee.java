package items;

public class WageEmployee extends Employee {
    private int hours;
    private double wage;

 //   public WageEmployee (){}

    public WageEmployee(String company, double baseSalary, int hours, double wage) {
        super(company, baseSalary);
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
                "hours=" + hours +
                ", wage=" + wage +
                '}';
    }
}
