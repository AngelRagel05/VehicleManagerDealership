package vehicles;

public class Motorbike extends Vehicle implements Insurable {

    private Boolean hasSidecar;

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * discountPercentage;
    }

    @Override
    public double calculateInsurance() {
        return price * 0.05;
    }
}
