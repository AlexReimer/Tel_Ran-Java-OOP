package university;

public class Person {
    private String firstName;
    private String secondName;
    private String uniID;
    private int birthday;


    public Person() {
    }

    public Person(String firstName, String secondName, String uniID, int birthday) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.birthday = birthday;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getUniID() {
        return uniID;
    }

    public void setUniID(String uniID) {
        this.uniID = uniID;
    }

    public int getBirthday() {
        return birthday;
    }

    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }

    void eats () {
        System.out.println("Mittagsessen ab 13:00 Uhr");
    }

    void earn () {};

    @Override
    public String toString() {
        return "\n" +
                "firstName='" + firstName + '\'' +
                "secondName='" + secondName + '\'' +
                "uniID='" + uniID + '\'' +
                "birthday='" + birthday + '\'';
    }
}
