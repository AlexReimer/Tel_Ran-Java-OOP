package cars;

import comparators.*;

import java.util.Arrays;
import java.util.Comparator;

public class CarAppl {
    public static void main(String[] args) {
        Car[] cars = {
                new Car(2015, "Mazda", "white", 1.8, 8000.),
                new Car(2010, "Opel", "olive", 1.2, 3000.),
                new Car(2019, "BWM", "grey", 2.8, 38000.),
                new Car(2008, "Toyota", "red", 1.6, 4000.),
                new Car(2011, "Peugeot", "green", 2.5, 13000.),
                new Car(2015, "Fiat", "coral", 1.4, 6000.),
                new Car(2006, "Mini", "yelow", 1.5, 7000.),
                new Car(1999, "Audi", "navy", 2.0, 8500.),
                new Car(1980, "Trabant", "blue", 1.9, 500.),
                new Car(2021, "Mersedes", "black", 4.8, 86000.),
        };
        displayCars(cars);
        System.out.println("__________");
        System.out.println("Sort by model: ");
        Arrays.sort(cars);
        displayCars(cars);

        System.out.println("__________");
        System.out.println("Sort by year: ");
        Arrays.sort(cars, new ComparatorByYear());
        displayCars(cars);

        System.out.println("__________");
        System.out.println("Sort by colour: ");
        Arrays.sort(cars, new ComparatorByColour());
        displayCars(cars);

        System.out.println("__________");
        System.out.println("Sort by engine: ");
        Arrays.sort(cars, new ComparatorByEngine());
        displayCars(cars);

        System.out.println("__________");
        System.out.println("Sort by price: ");
        Arrays.sort(cars, new ComparatorByPrice());
        displayCars(cars);

        System.out.println("__________");
        System.out.println("Sort by year and price: ");
        Arrays.sort(cars, new ComparatorByYearAndPrice());
        displayCars(cars);
    }

    private static void displayCars(Car[] cars) {
        for (Car a : cars) {
            System.out.println(a);
        }
    }
}
