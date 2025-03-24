package BuilderDesignPattern;

public class Car {

    private String carName;
    private String engine;
    private int wheels;
    private boolean airBags;

    // Constructor using CarBuilder
    public Car(CarBuilder builder) {
        this.carName = builder.carName;
        this.engine = builder.engine;
        this.wheels = builder.wheels;
        this.airBags = builder.airBags;
    }

    // Getters
    public String getCarName() {
        return carName;
    }

    public String getEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isAirBags() {
        return airBags;
    }

    @Override
    public String toString() {
        return "Car [carName=" + carName + ", engine=" + engine + ", wheels=" + wheels + ", airBags=" + airBags + "]";
    }
}
