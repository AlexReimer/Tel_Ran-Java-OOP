package items;


public abstract class Person implements Comparable<Person> {
    String name;
    long id;
    int age;

    public Person() {
        name = "No name";
    }

    public Person(String name, long id, int age) {
        if (name != null && !name.trim().isEmpty())
            this.name = name;
        else
            this.name = "No name";
        setId(id);
        setAge(age);
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id > 99_999_99 && id < 1_000_000_000)
            this.id = id;
        else
            System.out.println("Wrong id");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120)
            this.age = age;
        else
            System.out.println("Wrong age");
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", id=" + id + ", age=" + age + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Person))
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        return true;
    }

//
//	@Override
//	public boolean equals(Object o) {
//		if (this == o)
//			return true;
//		if (!(o instanceof Person))
//			return false;
//		Person person = (Person) o;
//		return getId() == person.getId();
//	}

    @Override
    public int compareTo(Person obj) {
        int res = name.compareToIgnoreCase(obj.name);
        //wrapper(класс-обертка Long) здесь на случ.если разница id-obj.id выйдет за
        // пределы экстренумы для инта - метод compare вернет int
        return res != 0 ? res : Long.compare(id, obj.id);

    }


}
