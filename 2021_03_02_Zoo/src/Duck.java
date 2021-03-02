public class Duck extends Pet{


    public Duck(String name) {
        super(name);
    }

//    public Duck() {
//        super();
//    }

//    public Duck() {
//        super();
//    }

    void moves() {
        this.swims();

    }

    void swims (){
        System.out.println("Плыви утка");
    }

    @Override
    public String toString () {
        return "Duck {}";
    }

    @Override
    public void eats() {
        //super.eats();
        System.out.println("Еще ночью тоже кушать");
    }

    @Override
    void sleep() {

    }
}
