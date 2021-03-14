package data;

public class SalesMan extends Employee {

	double totalSales;
	int bonuse;
	
	public SalesMan(String name, long id, int age, String company, double baseSalary, double totalSales, int bonuse) {
		super(name, id, age, company, baseSalary);
		setTotalSales(totalSales);
		setBonus(bonuse);
	}

	public SalesMan() {
	}

	public double getTotalSales() {
		return totalSales;
	}

	public void setTotalSales(double totalSales) {
		if(totalSales>0)
			this.totalSales = totalSales;
		else
			System.out.println("Wrong total sales");
	}

	public int getBonuse() {
		return bonuse;
	}

	public void setBonus(int bonuse) {
		if(bonuse>0)
			this.bonuse = bonuse;
		else
			System.out.println("Wrong bonuse");
	}

	@Override
	public String toString() {
		return "SalesMan [company=" + company + ", baseSalary=" + baseSalary + ", name=" + name + ", id=" + id
				+ ", age=" + age + ", totalSales=" + totalSales + ", bonuse=" + bonuse + "]";
	}

	
}
