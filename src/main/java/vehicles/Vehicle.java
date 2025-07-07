package vehicles;

public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected Double price;

    public Vehicle(String brand, String model, Double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Vehicle(){}

    public abstract double calculateDiscountedPrice(double discountPercentage);
}
