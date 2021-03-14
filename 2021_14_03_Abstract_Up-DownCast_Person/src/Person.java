import java.util.Objects;

public abstract class Person {
    String name;
    int age;
    long id;

    public Person(String name, int age, long id) {
        if (name != null)
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
        if (name != null && !name.trim().isEmpty())
            this.name = name;
        else
            System.out.println("Wrong name");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 70)
            this.age = age;
        else
            System.out.println("Wrong age");
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id > 0)
            this.id = id;
        System.out.println("Wrong id");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name= " + name + '\'' +
                ", age= " + age +
                ", id= " + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && id == person.id && Objects.equals(name, person.name);
    }
}
