public class Zebra extends Animal {


    public Zebra(String species, String name, int age) {
        super(species, name, age);
    }

    void dances() {
        System.out.println("I do like Macarena.");

    }

    @Override
    void sounds() {

    }

    @Override
    void eats() {

    }

    @Override
    void moves() {

    }

    @Override
    public String toString() {
        return "Zebra{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
