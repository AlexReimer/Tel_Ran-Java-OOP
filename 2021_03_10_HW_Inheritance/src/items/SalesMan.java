package items;

public class SalesMan extends Employee {
    private double totalSales;
    private int bonus;

    // public SalesMan (){}

    public SalesMan(String name, int age, String company, double baseSalary, double totalSales, int bonus) {
        super(company, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "name: '" + name + '\'' +
                ", age: " + age +
                ", company: " + company + '\'' +
                ", baseSalary= " + baseSalary +
                ", totalSales= " + totalSales +
                ", bonus= " + bonus +
                '}';
    }
}
