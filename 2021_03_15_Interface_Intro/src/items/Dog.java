package items;

import interfaces.IBarcable;

public class Dog extends Animals implements IBarcable {

    String nickName;

    public Dog(String kind, String subspscies, String nickName) {
        super(kind, subspscies);
        this.nickName = nickName;
    }

    public Dog(String nickName) {
        this.nickName = nickName;
    }

    public Dog() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "kind='" + kind + '\'' +
                ", subspscies='" + subspscies + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }

    @Override
    public void bark() {
        System.out.println("Bark");
    }
}
