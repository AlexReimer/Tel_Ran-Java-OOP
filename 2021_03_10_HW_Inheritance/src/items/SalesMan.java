package items;

public class SalesMan extends Employee {
    private double totalSales;
    private int bonus;

    public SalesMan(String name, int age, String company, double baseSalary, double totalSales, int bonus) {
        super(name, age, company, baseSalary);

        setTotalSales(totalSales);
        setBonus(bonus);
    }

    // public SalesMan (){}


    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        if (totalSales >= 1 && totalSales >= 1_000_000)
            this.totalSales = totalSales;
        else
            System.out.println("Wrong total Sales");
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus >= 1 && bonus >= 15)
            this.bonus = bonus;
        else
            System.out.println("Wrong bonus");
    }
//
//    @Override
//    public String getName (){
//        return name;
//    }
//
//    @Override
//    public void setName(String name) {
//        this.name = name;
//        System.out.println(name);
//    }
//
//    @Override
//    public int getAge() {
//        return age;
//    }
//    @Override
//    public void setAge(int age) {
//        this.age = age;
//    }


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
