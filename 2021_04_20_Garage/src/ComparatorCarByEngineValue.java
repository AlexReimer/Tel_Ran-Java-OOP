import java.util.Comparator;

public class ComparatorCarByEngineValue implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        return o2.getEngineValue().compareTo(o1.engineValue);
      //  return Double.compare(o2.getEngineValue(), o1.getEngineValue());
    }
}
