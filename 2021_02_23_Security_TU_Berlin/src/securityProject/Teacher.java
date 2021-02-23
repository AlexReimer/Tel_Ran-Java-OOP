package securityProject;

public class Teacher extends Person{
private double salary;
    public Teacher() {
    }



    public Teacher(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);
        setSalary (500_000_000);
    }

    private void setSalary(int i) {
    }

    //переопределение метода РОдительского класса * securityProject.Person
    @Override
    void eats() {
        super.eats();
        System.out.println("Frühstuck 9:00");
    }


    void teach () {
        System.out.println("Hab selber gelernt, du kannst es auch");
    }

}
