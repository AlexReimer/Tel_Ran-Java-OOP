package items;

public class SalesMan extends Employee {
    public double totalSales;
    int bonus;

    public SalesMan() {
    }

    public SalesMan(String name, long id, int age, String company, double baseSalary, double totalSales, int bonus) {
        super(name, id, age, company, baseSalary);
        setTotalSales(totalSales);
        setBonus(bonus);
    }

    public double getTotalSales() {

        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales >= 0.)
            this.totalSales = totalSales;
        else
            System.out.println("Wrong totalSales");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus >= 0 && bonus <= 100)
            this.bonus = bonus;
        else
            System.out.println("Wrong bonus");
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", baseSalary=" + baseSalary +
                ", totalSales=" + totalSales +
                ", bonus=" + bonus +
                '}';
    }

    @Override
    public double calcSalary() {
        return baseSalary + (bonus * totalSales) / 100;
    }

}
