public class Panda extends Animal {

    public Panda(String species, String name, int age) {
        super(species, name, age);
    }

    void trains() {
        System.out.println("Надеру задницу этому тиргу-прохвосту!");
    }

    @Override
    void sounds() {

    }

    @Override
    void eats() {
        System.out.println("Дома, в Китае, там бамбук вкуснее. Хочу обратно!!!");

    }

    @Override
    void moves() {

    }
}
