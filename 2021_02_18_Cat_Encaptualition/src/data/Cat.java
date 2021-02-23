package data;

public class Cat {
    private String name;
    private int age;
    private String breed;
    private boolean pass;

    // public
    // protected
    // без модификатора
    // private


    Cat(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    void move() {
        System.out.println("Двигаюсь, значит существую");
    }

    //set  изменяет значение поля
    void setName (String newName){
        this.name=newName;
    }

    void setAge (int age){
        this.age = age;
    }

    void setBreed (String breed){
        this.breed = breed;

    }

    void setPass(boolean pass){
        this.pass = pass;
    }


    // get не изменяет, но показывает значение поля
    //в boolean применяют не GET, а IS (джентельменское соглашение)
    public boolean isPass (){
        return pass;
    }

    public String getName (){
        return name;
    }

    public String getBreed (){
        return breed;
    }

    public int getAge (){
        return age;
    }

}

class TestCat {
    public static void main(String[] args) {
        Cat catchen = new Cat("Barsik", 1, "Перс");
        catchen.move();
        catchen.setName("Мурка");
        System.out.println(catchen.isPass());
        System.out.println(catchen.getName());


    }
}
