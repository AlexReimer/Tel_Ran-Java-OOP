public class SalesMan extends Employee {
    double totalSales;
    int bonus;

    public SalesMan(String name, int age, long id, String company, double baseSalary, double totalSales, int bonus) {
        super(name, age, id, company, baseSalary);

        setTotalSales(totalSales);
        setBonus(bonus);
    }

    public SalesMan() {
    }


    @Override
    public double calcSalary() {
        return baseSalary + (totalSales * bonus / 100);
    }


    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales > 0)
            this.totalSales = totalSales;
        else
            System.out.println("Wrong total Sales");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus > 0)
            this.bonus = bonus;
        else
            System.out.println("Wrong bonus");
    }


    @Override
    public String toString() {
        return "SalesMan{" +
                "name: " + name + '\'' +
                ", age: " + age +
                ", id= " + id +
                ", company: " + company + '\'' +
                ", baseSalary= " + baseSalary +
                ", totalSales= " + totalSales +
                ", bonus= " + bonus +
                '}';
    }
}
