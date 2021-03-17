package persons;

import java.util.Arrays;

public class PersonAppl {
    public static void main(String[] args) {
        Person[] persons = {
                new Person (1982, "Vasya"),
                new Person(1890, "Ivan"),
                new Person(1990, "Marina"),
                new Person(1970, "Kurt"),
                new Person(1994, "Sofia"),
                new Person(1982, "Erika")
        };
        displayPersons(persons);
        Arrays.sort(persons);
        System.out.println("========================================================");
        displayPersons(persons);
    }

    private static void displayPersons(Person[] persons) {
        for (Person p : persons) {
            System.out.println(p);
        }
    }
}
