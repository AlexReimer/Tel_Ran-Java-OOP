package university;

public class Teacher extends Person {
    private double salary;
    private double overtime;
    private int rateHour;


    public Teacher(String firstName, String secondName, String uniID, int birthday, double salary, double overtime, int rateHour) {
        super(firstName, secondName, uniID, birthday);
        this.salary = salary;
        this.overtime = overtime;
        this.rateHour = rateHour;
    }

    public Teacher() {
    }

    @Override
    void earn() {
        super.earn();
        System.out.println("Teachers receive a salary at the end of the month." + "\n");
    }


    @Override
    public String toString() {
        return "Teacher \n" +
                "firstName: " + getFirstName() + "\n" +
                "secondName: " + getSecondName() + "\n" +
                "uniID: " + getUniID() + "\n" +
                "birthday: " + getBirthday() + "\n" +
                "salary: " + salary + "\n" +
                "overtime pay: " + (overtime * rateHour) + "\n";
    }
}
