package items;

public class WageEmployee extends Employee {
    int hours;
    double wage;

    public WageEmployee(String name, int age, String company, double baseSalary, int hours, double wage) {
        super(name, age, company, baseSalary);

        setHours(hours);

        setWage(wage);
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 1 && hours >= 200)
            this.hours = hours;
        System.out.println("Wrong hours");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage >= 9 && hours >= 50)
            this.wage = wage;
        else
            System.out.println("Wrong wage");
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
