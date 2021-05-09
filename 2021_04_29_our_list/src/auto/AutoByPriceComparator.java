package auto;

import auto.Auto;

import java.util.Comparator;

public class AutoByPriceComparator implements Comparator<Auto> {
    @Override
    public  int compare(Auto o1, Auto o2) {
        return (int) (o1.getPrice()-o2.getPrice());
    }
}
