package university;

public class Worker extends Person {
    private double salary;
    private boolean performancePay;


    public Worker() {
    }

    public Worker(String firstName, String secondName, String uniID, int birthday, double salary, boolean performancePay) {
        super(firstName, secondName, uniID, birthday);
        this.salary = salary;
    }

    @Override
    void earn() {
        super.earn();
        System.out.println("Workers receive a salary and performance-related pay at the beginning of the month.");
    }

    @Override
    public String toString() {
        return "Worker \n" +
                "firstName: " + getFirstName() + "\n" +
                "secondName: " + getSecondName() + "\n" +
                "uniID: " + getUniID() + "\n" +
                "birthday: " + getBirthday() + "\n" +
                "salary: " + salary + "\n" +
                "performance pay: " + (salary * 0.12) + "\n";
    }
}
