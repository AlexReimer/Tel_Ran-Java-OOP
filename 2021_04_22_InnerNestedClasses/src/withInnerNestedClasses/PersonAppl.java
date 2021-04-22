package withInnerNestedClasses;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonAppl {

    public static void main(String[] args) {
        Person p1 = new Person(1111, "Vasya", "IBM");
        Person p2 = new Person(1234, "Maria", "HP");
        Person p3 = new Person(1567, "Luba", "Dell");
        Person p4 = new Person(1899, "Georg", "IBM");
        Person p5 = new Person(1278, "Sonya", "Apple");

        Set<Person> set = new TreeSet<>(new ComparatorById2());

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

       // System.out.println(set);
        for (Person p : set){
            System.out.println(p);
        }


    }

    public static class ComparatorById2 implements Comparator<Person>{

        @Override
        public int compare(Person o1, Person o2) {
            return o2.getId()- o1.getId();
        }
    }
}
