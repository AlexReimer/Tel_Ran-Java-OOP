package de.telran.application;

import de.telran.data.Student;

public class StartApplication {
    public static void main(String[] args) {
        Student vasyaPupkin = new Student();
        Student sergej = new Student();
        Student varvara = new Student();
        Student afdofia = new Student(
                "Афдофья",
                "Ивановна",
                18);
        System.out.println(vasyaPupkin.toDisplay ());
        System.out.println();
        System.out.println(vasyaPupkin.age);
        System.out.println();
        System.out.println(afdofia.toDisplay ());

        Student [] groupTUBerlin = new Student[] {vasyaPupkin, sergej, varvara, afdofia};
      //  System.out.println(group[3].age);

    }

    public static void studentPrint (Student [] group) {
        for (int i = 0; i < group.length; i++) {
            System.out.println(group [i].toDisplay());

        }
    }
}
