package persons;

import comparators.ComparatorsByName;
import comparators.ComparatorsByYear;

import java.util.Arrays;
import java.util.Comparator;

public class Person2Appl {
    public static void main(String[] args) {
        Person2[] persons = {
                new Person2 (1982, "Vasya"),
                new Person2(1890, "Ivan"),
                new Person2(1990, "Marina"),
                new Person2(1970, "Kurt"),
                new Person2(1994, "Sofia"),
                new Person2(1982, "Erika")
        };
        displayPersons(persons);
        // <Person2> - типизация, указание компаратору с чем он будет работать
        Comparator<Person2> comp = new ComparatorsByYear();
        Arrays.sort(persons, comp);
        System.out.println("========================================");
        displayPersons(persons);

        //не создаем объект отдельной строкой как выше,
        // а сразу в скобках объявлем переменную создавая объект Arrays.sort(persons, new ComparatorsByName());
        Arrays.sort(persons, new ComparatorsByName());
        System.out.println("========================================");
        displayPersons(persons);
    }

    private static void displayPersons(Person2[] persons) {
        for (Person2 p : persons){
            System.out.println(p);
        }
    }
}
