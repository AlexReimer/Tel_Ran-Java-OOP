package auto;

import java.util.Objects;

//TODO create a comparator comparing by price of two autos
//TODO test list for sort, max and min operations with Auto objects using the comparator from above.
public class Auto {

    private String make;
    private String color;
    private long price;

    public Auto(String make, String color, long price) {
        this.make = make;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }


    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Double.compare(auto.price, price) == 0 && Objects.equals(make, auto.make) && Objects.equals(color, auto.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, color, price);
    }



}
