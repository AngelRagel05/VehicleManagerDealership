package vehicles;

public class Motorbike extends Vehicle {

    private Boolean hasSidecar;

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * discountPercentage;
    }
}
