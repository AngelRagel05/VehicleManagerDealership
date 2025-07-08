package models;

import interfaces.Insurable;

public class Motorbike extends Vehicle implements Insurable {

    private Boolean hasSidecar;

    public Motorbike(String brand, String model, Double price, FuelType fuelType, Boolean hasSidecar)  {
        super(brand, model, price, fuelType);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * discountPercentage;
    }

    @Override
    public double calculateInsurance() {
        return price * 0.05;
    }
}
