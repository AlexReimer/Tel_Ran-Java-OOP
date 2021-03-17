package comparators;

import cars.Car;

import java.util.Comparator;

public class ComparatorByYearAndPrice implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        int temp = o1.getYear() - o2.getYear();
        return temp == 0 ? (int) (o1.getPrice() - o2.getPrice()) : temp;
    }
}
