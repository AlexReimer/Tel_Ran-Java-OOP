package comparators;

import persons.Person2;

import java.util.Comparator;

public class ComparatorsByName implements Comparator<Person2> {


    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
