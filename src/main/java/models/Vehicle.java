package models;


public abstract class Vehicle {

    protected String brand;
    protected String model;
    protected Double price;
    protected FuelType fuelType;

    public Vehicle(String brand, String model, Double price, FuelType fuelType) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
    }

    public abstract double calculateDiscountedPrice(double discountPercentage);
}
