package data;

public class Person {

	String name;
	long id;
	int age;

	public Person(String name, long id, int age) {
		if (name != null)
			this.name = name;
		else
			this.name = "Not defined";
		setId(id);
		setAge(age);
	}

	public Person() {
		this.name = "Not defined";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name != null)
			this.name = name;
		else
			System.out.println("Wrong name");
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if (id > 0)
			this.id = id;
		else
			System.out.println("Wrong id");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 0 || age < 120)
			this.age = age;
		else
			System.out.println("Wrong age");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
}
