package items;

import interfaces.IBarcable;
import interfaces.IChikikable;
import interfaces.IMewable;

public class Papagei extends Animals implements IChikikable, IBarcable, IMewable {
   String color;
   String nick;

    public Papagei(String kind, String subspscies, String color, String nick) {
        super(kind, subspscies);
        this.color = color;
        this.nick = nick;
    }

    public Papagei(String color, String nick) {
        this.color = color;
        this.nick = nick;
    }

    public Papagei() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    @Override
    public String toString() {
        return "Papagei{" +
                "kind='" + kind + '\'' +
                ", subspscies='" + subspscies + '\'' +
                ", color='" + color + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }

    @Override
    public void chirik() {
        System.out.println("chirik-chirik");
    }

    @Override
    public void bark() {
        System.out.println("bark-chirik");
    }

    @Override
    public void mew() {
        System.out.println("mew-cchirik");
    }
}
