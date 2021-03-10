package items;

public class SalesMan extends Employee {
    private double totalSales;
    private int bonus;

    public SalesMan(String name, int age, String company, double baseSalary, double totalSales, int bonus) {
        super(name, age, company, baseSalary);
        this.totalSales = totalSales;
        this.bonus = bonus;
    }

    // public SalesMan (){}



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
