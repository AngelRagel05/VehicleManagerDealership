package models;

import interfaces.Insurable;

public class Car extends Vehicle implements Insurable {

    private Integer numberDoors;

    public Car(String brand, String model, Double price, FuelType fuelType, int numberDoors)  {
        super(brand, model, price, fuelType);
        this.numberDoors = numberDoors;
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * discountPercentage;
    }

    @Override
    public double calculateInsurance() {
        return price * 0.03;
    }

    @Override
    public String toString() {
        return "🚗 Car {" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", fuelType=" + fuelType +
                ", numberOfDoors=" + numberDoors +
                '}';
    }
}