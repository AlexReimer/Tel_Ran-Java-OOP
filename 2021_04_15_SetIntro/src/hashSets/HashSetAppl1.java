package hashSets;

import java.util.*;

public class HashSetAppl1 {
    public static void main(String[] args) {

        HashSet<String> persons = new HashSet<String>();
        System.out.println(persons.add("Petr Petrovich"));
        persons.add("Maria Viktorovna");
        persons.add("Just Pasha");
        System.out.println(persons);
        System.out.println(persons.add("Just Pasha"));
        //===================================

        HashSet<Cat> catsSet = new HashSet<>();
        Cat cat1 = new Cat("aaa", 5);
        Cat cat2 = new Cat("bbb", 4);
        Cat cat3 = new Cat("ccc", 3);
        Cat cat4 = new Cat("ddd", 10);
        Cat cat5 = new Cat("ddd", 10);
        catsSet.addAll(Arrays.asList(cat1,cat2,cat3,cat4));
     //   System.out.println(catsSet);
       printSet(catsSet);
        System.out.println(catsSet.add(cat5));
        printSet(catsSet);
//===================================
        LinkedHashSet<Cat>catsLinkedSet = new LinkedHashSet<>(Arrays.asList(cat1,cat2,cat3,cat4));

        //===================================
        TreeSet<Cat> treeCats = new TreeSet<Cat>(Arrays.asList(cat1,cat2,cat3,cat4));
        printSet(treeCats);

    }

    private static void printSet(Set<Cat> catsSet) {
        for (Cat cat : catsSet){
            System.out.println(cat);
        }
    }



}
