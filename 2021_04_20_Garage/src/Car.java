import javax.xml.soap.SAAJResult;

public class Car {
    String model;
    String plateNumber;
    Double engineValue;
    String color;


    public Car(String model, String plateNumber, Double engineValue, String color) {
        this.model = model;
        this.plateNumber = plateNumber;
        this.engineValue = engineValue;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public Double getEngineValue() {
        return engineValue;
    }

    public void setEngineValue(Double engineValue) {
        this.engineValue = engineValue;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", plateNumber='" + plateNumber + '\'' +
                ", engineValue=" + engineValue +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (!model.equals(car.model)) return false;
        if (!plateNumber.equals(car.plateNumber)) return false;
        if (!engineValue.equals(car.engineValue)) return false;
        return color.equals(car.color);
    }

    @Override
    public int hashCode() {
        int result = model.hashCode();
        result = 31 * result + plateNumber.hashCode();
        result = 31 * result + engineValue.hashCode();
        result = 31 * result + color.hashCode();
        return result;
    }


}

