import javax.swing.*;

public class Dragon extends Animal {
    public String color;

    public Dragon(String species, String name, int age, String color) {
        super(species, name, age);
        this.color = color;
    }

    void spewsFire (){
        System.out.println("Изрыгаю ли пламя? Да, когда злюсь, это происходит само-собой");
    }

    @Override
    void sounds() {

    }

    @Override
    void eats() {

    }

    @Override
    void moves() {
        System.out.println("Я бы полетал, да привязвн цепью");

    }

    @Override
    public String toString() {
        return "Dragon{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color=" + color +
                '}';
    }
}
