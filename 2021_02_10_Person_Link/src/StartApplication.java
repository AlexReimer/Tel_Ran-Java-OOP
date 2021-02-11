public class StartApplication {
    public static void main(String[] args) {
        //SPA
        Person p1= new Person ("Andrej", 18, 100);
        Person p2= new Person ("Monika", 28, 101);
        Person p3= new Person ("Lev", 38, 102);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        Person p4 = p1; //р4 здесь не новый объект, а копия р1 на самом деле.
        // Это ссылка на уже существующий объект р1
        p4.firstName = "Sergej";
        System.out.println(p4.firstName);
        System.out.println(p4);

        //здесь тоже р4 не новый объект после того как p5 = p1.
        // Он стал ссылкой на уже существующий объект р1
        Person p5 = new Person();
        p5 = p1;
        p5.firstName = "Света";
        System.out.println(p1.firstName);
    }
}
