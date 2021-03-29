package comparators;

import cars.Car;

import java.util.Comparator;

public class ComparatorByEngine implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
//        if (o1.getEngine() < o2.getEngine()) return -1;
//        if (o1.getEngine() > o2.getEngine()) return 1;
//        return 0;
        return Double.compare(o1.getEngine(), o2.getEngine());
    }
}
