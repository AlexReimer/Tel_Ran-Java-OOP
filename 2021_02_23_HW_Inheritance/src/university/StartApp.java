package university;

public class StartApp{
    public static void main(String[] args) {
        Student st1 = new Student("Beniamin", "Huber", "2020-01-00119", 2001, 2.5, 3, true);
        System.out.println(st1);
        System.out.println("*******");
        Student st2 = new Student("Dennis", "Peterson", "2018-02-98739", 1999, 2.1, 7, true);
        System.out.println(st2);
        System.out.println("*******");
        Student st3 = new Student("Jenifer", "Tiel", "2019-01-00298", 1998, 1.5, 4, true);
        System.out.println(st3);

        st1.studys();
        st2.eats();

        //   Student[] students = new Student[]{st1, st2,st3};


        System.out.println("#######");
        Teacher tch1 = new Teacher("Jordan", "Peterson", "2005-07-09", 1965, 8_000, 23.5, 35);
        System.out.println(tch1);
        System.out.println("#######");
        Teacher tch2 = new Teacher("Barbara", "Schöneberger", "2011-09-03", 1981, 7_200, 15, 35);
        System.out.println(tch2);
        System.out.println("#######");
        Teacher tch3 = new Teacher("Martin", "Knoblauch", "2008-5-876", 1989, 6_800, 0, 35);
        System.out.println(tch3);

        tch2.earn();

        //   Teacher [] teachers = new Teacher[] {tch1, tch2, tch3};

        System.out.println("<><><>");
        Worker wrk1 = new Worker("Uwe", "Klugscheisser", "2011-11-04", 1991, 1_800, true);
        System.out.println(wrk1);
        System.out.println("<><><>");
        Worker wrk2 = new Worker("Juna", "Dobra", "2009-2-21798", 1978, 1_900, true);
        System.out.println(wrk2);
        System.out.println("<><><>");
        Worker wrk3 = new Worker("Maria", "Seouwsky", "2009-2-2198", 1988, 1_800, true);
        System.out.println(wrk3);

        wrk1.earn();

        //    Worker [] workers = new Worker[] {wrk1, wrk2, wrk3};

        //  Object [] [] [] staff = new Object {{st1, st2,st3}, {tch1, tch2, tch3}, {wrk1, wrk2, wrk3}};


        System.out.println();
    }
}
