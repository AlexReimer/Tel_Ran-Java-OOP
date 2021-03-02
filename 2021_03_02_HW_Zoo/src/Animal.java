abstract class Animal {
    String species;
    String name;
    int age;


    public Animal(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }

    abstract void sounds ();
    abstract void eats ();
    abstract void moves ();



    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

