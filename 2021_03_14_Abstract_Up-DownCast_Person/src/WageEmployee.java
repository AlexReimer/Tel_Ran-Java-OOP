public class WageEmployee extends Employee {
    int hours;
    double wage;

    public WageEmployee(String name, int age, long id, String company, double baseSalary, int hours, double wage) {
        super(name, age, id, company, baseSalary);

        setHours(hours);
        setWage(wage);
    }


    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours > 0)
            this.hours = hours;
        System.out.println("Wrong hours");
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        if (wage > 0)
            this.wage = wage;
        else
            System.out.println("Wrong wage");
    }

    @Override
    public double calcSalary() {
        return hours * wage + baseSalary;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "name: " + name + '\'' +
                ", age: " + age +
                ", id= " + id +
                ", company: " + company + '\'' +
                ", baseSalary= " + baseSalary +
                ", hours=" + hours +
                ", wage=" + wage +
                '}';
    }
}
