package comparators;

import cars.Car;

import java.util.Comparator;

public class ComparatorByPriceAndYear implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        // 2. Variant
       int comparedByPrice = Double.compare(o1.getPrice(), o2.getPrice());
       return comparedByPrice !=0 ? comparedByPrice : o2.getYear() - o1.getYear();


        // 1.Variaant compare by Price
//        int temp = (int) (o1.getPrice() - o2.getPrice());
//        return temp == 0 ? o1.getYear() - o2.getYear() : temp;
        // 1.Variaant compare by year
//        int temp = o1.getYear() - o2.getYear();
//        return temp == 0 ? (int) (o1.getPrice() - o2.getPrice()) : temp;


    }
}
