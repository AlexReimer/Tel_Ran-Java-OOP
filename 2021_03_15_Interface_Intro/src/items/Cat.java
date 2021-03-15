package items;

import interfaces.IMewable;

public class Cat extends Animals implements IMewable {
    String name;

    public Cat(String kind, String subspscies, String name) {
        super(kind, subspscies);
        this.name = name;
    }

    public Cat(String name) {
        this.name = name;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "kind='" + kind + '\'' +
                ", subspscies='" + subspscies + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void mew() {

    }
}
