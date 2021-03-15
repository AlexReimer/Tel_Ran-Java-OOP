public class Manager extends Employee {
    int grade;

    public Manager(String name, int age, long id, String company, double baseSalary, int grade) {
        super(name, age, id, company, baseSalary);

        setGrade(grade);
    }

    public Manager() {
    }


    @Override
    public double calcSalary() {
        return baseSalary + (baseSalary * grade / 10);
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade < 5)
            this.grade = grade;
        else
            System.out.println("Wrong grade");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", id=" + id +
                ", company: " + company + '\'' +
                ", baseSalary= " + baseSalary +
                ", grade=" + grade +
                '}';
    }
}
