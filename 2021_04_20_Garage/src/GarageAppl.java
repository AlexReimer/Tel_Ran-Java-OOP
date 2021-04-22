import java.util.*;

public class GarageAppl {
    public static void main(String[] args) {
        //     Map<String, Car> garage = new HashMap<String,Car>();
        //   Map<String, Car> garage = new LinkedHashMap<String, Car>();
        Map<String, Car> garage = new TreeMap<String, Car>();

        Car car1 = new Car("Nissan", "A140FFM", 2.0, "Red");
        Car car2 = new Car("BMW", "B225AAM", 2.5, "White");
        Car car3 = new Car("Lada", "C189FFM", 1.8, "Baklagan");
        Car car4 = new Car("Lada", "C189FFM", 1.8, "Baklagan");

        garage.put(car1.getPlateNumber(), car1);
        garage.put(car2.getPlateNumber(), car2);
        garage.put(car3.getPlateNumber(), car3);
        printMap(garage);

        garage.put(car4.getPlateNumber(), car4);
        printMap(garage);

        //==================
        //  Map<Car, String> garage2 = new HashMap<Car, String>();
        //     Map<Car, String> garage2 = new TreeMap<Car, String>(new ComparatorCarByEngineValue());
        Map<Car, String> garage2 = new TreeMap<Car, String>(new Comparator<Car>() {

            @Override
            public int compare(Car o1, Car o2) {
                return o1.getEngineValue().compareTo(o2.engineValue);
            }
        });
        garage2.put(car1, car1.getPlateNumber());
        garage2.put(car2, car2.getPlateNumber());
        garage2.put(car3, car3.getPlateNumber());
        printMap2(garage2);

        garage2.put(car4, car4.getPlateNumber());
        printMap2(garage2);
    }

    private static void printMap2(Map<Car, String> garage) {
        for (Map.Entry<Car, String> e : garage.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println("===================================");
    }

    private static void printMap(Map<String, Car> cars) {
        for (Map.Entry<String, Car> e : cars.entrySet()) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
        System.out.println("===================================");
    }
}
