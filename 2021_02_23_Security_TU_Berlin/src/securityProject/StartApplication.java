package securityProject;

public class StartApplication {
    public static void main(String[] args) {
   Student sascha = new Student();
//        sascha.study();

        sascha.eats();

        Student kate = new Student( "Kate", "Schumi", "2021_021");
        System.out.println(kate);
        System.out.println(kate);
        System.out.println("------------------");
        Person ps = new Person();
        System.out.println(ps);
        System.out.println("------------------");
        System.out.println("учитель");
        Teacher tc = new Teacher();
        System.out.println(tc.toString());

    }
}
