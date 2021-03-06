package items;

public class Manager extends Employee {
    int grade;

    public Manager(String name, int age, String company, double baseSalary, int grade) {
        super(name, age, company, baseSalary);

        setGrade(grade);
    }

    public Manager () {}

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 4)
            this.grade = grade;
        else
            System.out.println("Wrong grade");
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", company: " + company + '\'' +
                ", baseSalary= " + baseSalary +
                ", grade=" + grade +
                '}';
    }
}
