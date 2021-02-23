package securityProject;

public class Worker extends Person {

    @Override
    void eats() {
        super.eats();
        System.out.println("Muss noch arbeiten, erst dann essen");
    }

    void works() {
        System.out.println("8 Stunden pro Tag");
    }
}
