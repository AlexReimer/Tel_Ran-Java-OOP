public class Lion extends Animal {


    public Lion(String species, String name, int age) {
        super(species, name, age);
    }

    void rules() {
        System.out.println("Рулю, ибо Царь!");
    }

    @Override
    void sounds() {

    }

    @Override
    void eats() {
        System.out.println("Где моя телячья вырезка?");

    }

    @Override
    void moves() {

    }


    @Override
    public String toString() {
        return "Lion{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
