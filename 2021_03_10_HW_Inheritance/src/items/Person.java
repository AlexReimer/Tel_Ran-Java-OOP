package items;

import java.util.Objects;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        if (name!=null&&!name.trim().isEmpty())
            this.name = name;
        else
            this.name = "Not defined";

        setAge(age);
    }

    public Person() {
        name = "Not defined";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name!=null&&!name.trim().isEmpty())
            this.name = name;
        else
            System.out.println("Wrong name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>18 && age <70)
            this.age = age;
        else
            System.out.println("Wrong age");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

}
