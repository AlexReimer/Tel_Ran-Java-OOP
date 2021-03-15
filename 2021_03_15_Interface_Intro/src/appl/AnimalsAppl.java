package appl;


import interfaces.IBarcable;
import items.*;

public class AnimalsAppl {
    public static void main(String[] args) {
        Animals [] anAr = {
                new Cat ("kind of cat", "cats", "Vaska"),
                new Cat ("kind of cat", "cats", "Mascha"),
                new Dog ("kind of dog", "gogs", "Gav"),
                new Dog ("kind of dog", "gogs", "Scharik"),
                new Papagei("kind of birds", "birds", "green", "Gosha"),
                new Papagei("kind of birds", "birds", "green","Kescha")
        };

        printAllBarkable(anAr);
    }

    private static void printAllBarkable(Animals[] anAr) {
        for (Animals a : anAr){
            if (a instanceof IBarcable) {
                IBarcable temp = (IBarcable) a;
                temp.bark();
                System.out.println(a);

            }
        }
    }
}
