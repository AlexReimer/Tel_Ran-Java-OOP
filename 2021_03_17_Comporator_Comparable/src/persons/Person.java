package persons;

import java.util.Objects;

public class Person implements Comparable<Person>{

    private int birthYear;
    private String name;

    public Person(int birthYear, String name) {
        super();
        this.birthYear = birthYear;
        this.name = name;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [" +
                "birthYear=" + birthYear +
                ", name=" + name + "]";
    }

    @Override
    public int compareTo(Person o) {
        //sort varianten
        //return birthYear - o.birthYear;//aufsteigend (kleiner zu großer)
        //return o.birthYear - birthYear; //absteigend (großer zu kleiner)
        //return name.compareTo(o.name); //alphabetisch a,b,c...
        //return o.name.compareTo(name); //alphabetisch umgekehrt

        //sort by two criterien - name and birthYear
        //first one - bitrhYear and safe in res
        // if res=0 -> bitrhYear are same, then compare String name and o.name in ternar operator
        // if res !=0 return res
        int res = birthYear - o.birthYear;
        return res==0?name.compareTo(o.name):res;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear && name.equals(person.name);
    }


}
