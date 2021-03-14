package data;

public class Manager extends Employee {

	int grade;

	public Manager(String name, long id, int age, String company, double baseSalary, int grade) {
		super(name, id, age, company, baseSalary);
		setGrade(grade);
	}

	public Manager() {
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
		return "Manager [company=" + company + ", baseSalary=" + baseSalary + ", name=" + name + ", id=" + id + ", age="
				+ age + ", grade=" + grade + "]";
	}

}
