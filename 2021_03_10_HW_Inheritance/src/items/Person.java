package items;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        if (name!=null&&!name.trim().isEmpty())
            this.name = name;
        else
            this.name = "No name";

        setAge(age);
    }

    public Person() {
        name = "No mane";

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
}
