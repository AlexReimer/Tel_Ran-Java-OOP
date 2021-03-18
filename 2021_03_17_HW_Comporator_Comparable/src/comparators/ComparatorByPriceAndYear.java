package comparators;

import cars.Car;

import java.util.Comparator;

public class ComparatorByPriceAndYear implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

         int temp = (int) (o1.getPrice() - o2.getPrice());
         return temp == 0 ? o1.getYear() - o2.getYear() : temp;
//        int temp = o1.getYear() - o2.getYear();
//        return temp == 0 ? (int) (o1.getPrice() - o2.getPrice()) : temp;
    }
}
