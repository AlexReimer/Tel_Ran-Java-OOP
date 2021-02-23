package university;

public class Student extends Person{
    private double scoreAverage;
    private int semester;
    private boolean paid;

    public Student(double scoreAvarage, int semester, boolean paid) {
        this.scoreAverage = scoreAvarage;
        this.semester = semester;
        this.paid = paid;
    }

    public Student(String firstName, String secondName, String uniID, int birthday, double scoreAvarage, int semester, boolean paid) {
        super(firstName, secondName, uniID, birthday);
        this.scoreAverage = scoreAvarage;
        this.semester = semester;
        this.paid = paid;
    }

    void studys () {
        System.out.println("\n" + "Lectures start at 9 o'clock on Monday-Friday.");
    }

    @Override
    void eats() {
      //  super.eats();
        System.out.println("\n" + "Mittagsessen ab 13:00 Uhr in der Studenten-Kantine." + "\n");
    }

    @Override
    public String toString() {
        return "Student\n" +
                "firstName: " + getFirstName() + "\n" +
                "secondName: " + getSecondName() + "\n" +
                "uniID: " + getUniID() + "\n" +
                "birthday: " + getBirthday() + "\n" +
                "avarage score: " + scoreAverage + "\n" +
                "semester: " + semester + "\n" +
                "study paid: " + paid;
    }
}
