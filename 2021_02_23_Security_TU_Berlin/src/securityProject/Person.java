package securityProject;

public class Person {
    private String firstName;
    private String secondName;
    private String uniID;

    public Person(String firstName, String secondName, String uniID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUniID() {
        return uniID;
    }

    void eats() {
        System.out.println("Обед в 13:00");
    }

    @Override
    public String toString() {
        return "\n" +
                "firstname " + firstName + "\n" +
                "secondName " + secondName + "\n" +
                "uniID " + uniID + "\n";
    }
}
