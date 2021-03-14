package data;

public class WageEmployee extends Employee {

	int hours;
	double wage;

	public WageEmployee(String name, long id, int age, String company, double baseSalary, int hours, double wage) {
		super(name, id, age, company, baseSalary);
		setHours(hours);
		setWage(wage);
	}

	public WageEmployee() {
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		if (hours > 0)
			this.hours = hours;
		else
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
	public String toString() {
		return "WageEmployee [company=" + company + ", baseSalary=" + baseSalary + ", name=" + name + ", id=" + id
				+ ", age=" + age + ", hours=" + hours + ", wage=" + wage + "]";
	}


}
