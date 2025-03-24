package BuilderDesignPattern;

public class CarBuilder {

    // Car properties to be set by builder
    String carName;
    String engine;
    int wheels;
    boolean airBags;

    // Setters that return CarBuilder object to allow method chaining
    public CarBuilder setCarName(String carName) {
        this.carName = carName;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder setWheels(int wheels) {
        this.wheels = wheels;
        return this;
    }

    public CarBuilder setAirBags(boolean airBags) {
        this.airBags = airBags;
        return this;
    }

    // Build method to create Car object
    public Car build() {
        return new Car(this);
    }
}
