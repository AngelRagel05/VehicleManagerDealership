package vehicles;

public class Car extends Vehicle {

    private Integer numberDoors;

    @Override
    public double calculateDiscountedPrice(double discountPercentage) {
        return price * discountPercentage;
    }

}
