package items;

public class Manager extends Employee {
    int grade;


    public Manager() {
    }

    public Manager(String name, long id, int age, String company, double baseSalary,int grade) {
        super(name, id, age, company, baseSalary);
        setGrade(grade);
    }

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
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                ", grade=" + grade +
                '}';
    }

    @Override
    public double calcSalary() {
        return baseSalary * grade;
    }
}
