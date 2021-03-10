package items;

public class Manager extends Employee{
    private int grade;


    public Manager(String company, double baseSalary, int grade) {
        super(company, baseSalary);
        this.grade=grade;
    }

  //  public Manager () {}

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "grade=" + grade +
                '}';
    }
}
