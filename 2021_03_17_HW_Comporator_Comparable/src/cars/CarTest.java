package cars;

import comparators.ComparatorByYear;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CarTest {
    Car car1 = new Car(2015, "Mazda", "white", 1.8, 8000.);
    Car car2 = new Car(2010, "Opel", "olive", 1.2, 3000.);
    Car car3 = new Car(2019, "BWM", "grey", 2.8, 38000.);
    Car car4 = new Car(2008, "Toyota", "red", 1.6, 4000.);
    Car car5 = new Car(2011, "Peugeot", "green", 2.5, 13000.);
    Car car6 = new Car(2015, "Fiat", "coral", 1.4, 6000.);
    Car car7 = new Car(2006, "Mini", "yelow", 1.5, 7000.);
    Car car8 = new Car(1999, "Audi", "navy", 2.0, 8500.);
    Car car9 = new Car(1980, "Trabant", "blue", 1.9, 500.);
    Car car10 = new Car(2021, "Mersedes", "black", 4.8, 86000.);

    Car[] cars;


    @org.junit.Before
    public void setUp() throws Exception {
        cars = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
    }

    @org.junit.Test
    public void testComparable() {
        Arrays.sort(cars);
        Car[] ex = new Car[]{car1, car2, car3, car4, car5, car6, car7, car8, car9, car10};
        assertArrayEquals(ex, cars);
    }


    @org.junit.Test
    public void testComparatorByYear() {
        Arrays.sort(cars, new ComparatorByYear());
        for (int i = 0; i < cars.length - 1; i++) {
            assertTrue(cars[i].getYear() <= cars[i + 1].getYear());
        }
    }
}