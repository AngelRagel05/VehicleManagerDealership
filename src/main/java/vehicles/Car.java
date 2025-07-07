package vehicles;

public class Car extends Vehicle implements Insurable {

    private Integer numberDoors;

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * discountPercentage;
    }

    @Override
    public double calculateInsurance() {
        return price * 0.03;
    }
}
