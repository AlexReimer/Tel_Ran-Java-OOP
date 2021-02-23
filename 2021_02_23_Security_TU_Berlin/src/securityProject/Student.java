package securityProject;

public class Student<rating> extends Person{
    private double rating;

    public Student(String firstName, String secondName, String uniID) {
        super(firstName, secondName, uniID);
        rating =10.0;
    }



    public Student() {
    }


    @Override
    public String toString() {
        return "securityProject.Student {" +
                "firstname " + super.getFirstName() + " \n" +
                "secondname " + super.getSecondName() + " \n" +
                "uniID " + super.getUniID() + " \n" +
                "rating" + rating;
    }



    //переопределение
    @Override
    void eats() {
        super.eats();
        System.out.println("Abendessen 18:00 Uhr");
    }

    void study(){
        //бизнес логика
        System.out.println("Ich lerne doch");
    }
}
